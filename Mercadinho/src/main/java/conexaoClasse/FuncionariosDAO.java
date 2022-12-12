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
            statement.setString(1, funcionario.getMatricula());
            statement.setString(2, funcionario.getNome());
            statement.setString(3, funcionario.getCargo());
            statement.setFloat(4, funcionario.getSalario());
            statement.setString(5, funcionario.getSenha());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário Salvo Com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Funcionário!");
            
        }finally{
            Conexao.fecharConexao(conexao, statement);
        }
    }
    
    public boolean VerificaLogin (String Matricula, String Senha){
         Connection conexao = Conexao.getConnection();
         PreparedStatement statement = null;
         ResultSet result = null;

         boolean verifica = false;
         
         try{
            statement = conexao.prepareStatement("SELECT * FROM funcionarios WHERE Matricula =? and Senha =?");
            statement.setString(1, Matricula);
            statement.setString(2, Senha);

            result  = statement.executeQuery();
            
            if(result.next()){
            
                verifica = true;
            }
        }catch(SQLException ex){
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.fecharConexao(conexao, statement, result);
        }

        return verifica;
}
    
    public void AtualizaFuncionario(Funcionarios f) {

        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;
        
       
        try {
            statement = conexao.prepareStatement("UPDATE funcionarios SET Nome =? WHERE MATRICULA =?;\n" +
                                                 "UPDATE funcionarios SET CARGO=? WHERE MATRICULA=?;\n" +
                                                 "UPDATE funcionarios SET Salario =? WHERE MATRICULA =?");
            statement.setString(1, f.getMatricula());
            statement.setString(2, f.getNome());
            statement.setString(3, f.getCargo());
            statement.setFloat(4,f.getSalario() );
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
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
                novo.setCargo(result.getString("Cargo"));
                novo.setSalario(result.getFloat("Salario"));
                novo.setSenha(result.getString("Senha"));

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


public void ExcluiFuncionario(Funcionarios f) {

         Connection conexao = Conexao.getConnection();
         PreparedStatement statement = null;

        try {
            statement = conexao.prepareStatement("DELETE FROM funcionarios WHERE Matricula = ?");
            statement.setString(1, f.getMatricula());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Conexao.fecharConexao(conexao, statement);
        }

    }
}

  



