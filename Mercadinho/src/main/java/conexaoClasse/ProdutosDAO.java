/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoClasse;

import classes.Produtos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProdutosDAO {
    
    public void criaProdutos(Produtos produto) {
        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;

        try {
            
            statement = conexao.prepareStatement("INSERT INTO Produtos (idproduto, nome, marca, departamento, preco) Values (?,?, ?, ?, ?)");
            statement.setInt(1, produto.getIDProduto());
            statement.setString(2, produto.getNome());
            statement.setString(3,produto.getMarca());
            statement.setString(4, produto.getDepartamento());
            statement.setFloat(5, produto.getPreco());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto Salvo Com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Produto!");
        }finally{
            Conexao.fecharConexao(conexao, statement);
        }
    } 
    
    public ArrayList<Produtos> buscaTodosProdutos() {
        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        ArrayList<Produtos> produtos = new ArrayList<>(); 

        try {
            statement = conexao.prepareStatement("SELECT * FROM Produtos");
            result = statement.executeQuery();

            while(result.next()){
                Produtos novo = new Produtos();

                novo.setIDProduto(Integer.parseInt(result.getString("IDProduto")));
                novo.setNome(result.getString("Nome"));
                novo.setMarca(result.getString("Marca"));
                novo.setDepartamento(result.getString("Departamento"));
                novo.setPreco(result.getFloat("Preco"));

                produtos.add(novo);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Funcionário!");
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.fecharConexao(conexao, statement, result);
        }

        return produtos;
    }
    
    public void ExcluiProdutos(Produtos p) {

         Connection conexao = Conexao.getConnection();
         PreparedStatement statement = null;

        try {
            statement = conexao.prepareStatement("DELETE FROM produtos WHERE IDProduto = ?");
            statement.setInt(1, p.getIDProduto());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Conexao.fecharConexao(conexao, statement);
        }

    }
    
    public void AtualizaProdutos(Produtos p) {

        Connection conexao = Conexao.getConnection();
        PreparedStatement statement = null;
        
       
        try {
            statement = conexao.prepareStatement("UPDATE produtos SET NOME = ?, MARCA = ?, DEPARTAMENTO = ?, PRECO = ? WHERE IDPRODUTO = ?");
            statement.setString(1, p.getNome());
            statement.setString(2, p.getMarca());
            statement.setString(3, p.getDepartamento() );
            statement.setFloat(4, p.getPreco());
            statement.setInt(5, p.getIDProduto());
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Conexao.fecharConexao(conexao, statement);
        }

    }
}
