/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoClasse;

import classes.Funcionarios;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FuncionariosDAO {

    public void cria(Funcionarios funcionario) {
        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;

        try {
            
            statement = conexao.prepareStatement("INSERT INTO Funcionarios (matricula, nome, cargo, salario, senha) Values (?, ?, ?, ?, ?)");
            statement.setString(0, funcionario.getMatricula());
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getCargo());
            statement.setFloat(3, funcionario.getSalario());
            statement.setString(4, funcionario.getSenha());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário Salvo Com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Funcionário!");
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.fecharConexao(conexao, statement);
        }
    }
    
    public ArrayList<Funcionarios> buscaTodosFuncionarios() {
        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        ArrayList<Funcionarios> funcionarios = new ArrayList<>(); 

        try {
            statement = conexao.prepareStatement("SELECT * FROM Funcionarios");
            result = statement.executeQuery();

            while(result.next()){
                Funcionarios novo = new Funcionarios();

                novo.setMatricula(result.getString("Matricula"));
                novo.setNome(result.getString("Nome"));
                novo.setSenha(result.getString("Senha"));
                novo.setCargo(result.getString("Cargo"));
                novo.setSalario(result.getFloat("Salario"));

                funcionarios.add(novo);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Funcionário!");
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.fecharConexao(conexao, statement, result);
        }

        return funcionarios;
    }
}



