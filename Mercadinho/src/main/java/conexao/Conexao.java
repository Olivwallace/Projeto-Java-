<<<<<<< OURS
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/BDGMW";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("ERRO ao Conectar: ", ex);
        }
    }

    public static void fecharConexao(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fecharConexao(Connection conexao, PreparedStatement statement) {
        if (conexao != null) {
            fecharConexao(conexao);
        }

        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fecharConexao(Connection conexao, PreparedStatement statement, ResultSet result) {

        fecharConexao(conexao, statement);

        try {
            if (result != null) {
                result.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
=======
package conexao;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.*;

public class Conexao {

    public static void main(String[] args) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql:/127.0.0.1:3306/BGMW", "", "");
        }catch (ClassNotFoundException ex){
            System.out.println("Erro");
        }
    }
}
*/
>>>>>>> THEIRS
