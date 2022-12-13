/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoClasse;


import classes.Clientes;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ClientesDAO {
    
    public void cria(Clientes cliente) {
        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;

        try {
            
            statement = conexao.prepareStatement("INSERT INTO Clientes (CPF, NOME, ENDERECO, SENHA) Values (?, ?, ?, ?)");
            statement.setString(1, cliente.getCPF());
            statement.setString(2,cliente.getNome());
            statement.setString(3, cliente.getEndereco());
            statement.setString(4, cliente.getSenha());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Salvo Com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Cliente!");
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.fecharConexao(conexao, statement);
        }
    }    
}
