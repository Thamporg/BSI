package Teste;
import java.sql.*;
import javax.swing.JOptionPane;

    
// Classe responsável pela conexão e métodos do banco de dados
    public class TextPerg {
    private static final String URL = "jdbc:mysql://localhost:3307/quiz";
    private static final String USER = "root"; // Substitua pelo seu usuário
    private static final String PASSWORD = "ifbaiano"; // Substitua pela sua senha

    // Método para conectar ao banco de dados
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Puxar o texto da pergunta pelo ID
    public static String getPergunta(int id) {
        String sql = "SELECT pergunta FROM questoes WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("pergunta");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    
}

