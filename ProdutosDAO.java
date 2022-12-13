/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoClasse;

import classes.Produtos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProdutosDAO {
    
    public void cria(Produtos produto) {
        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;

        try {
            
            statement = conexao.prepareStatement("INSERT INTO Produtos (NOME, MARCA, DEPARTAMENTO, PRECO) Values (?, ?, ?, ?)");
            statement.setString(0, produto.getNome());
            statement.setString(1,produto.getMarca());
            statement.setString(3, produto.getDepartamento());
            statement.setFloat(4, produto.getPreco());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto Salvo Com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Produto!");
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.fecharConexao(conexao, statement);
        }
    }  
}
