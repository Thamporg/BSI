package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/quiz";
        String user = "root";
        String password = "ifbaiano";

        try {
            // Conectar ao banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao bem-sucedida!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro na conexao: " + e.getMessage());
        }
    }
}