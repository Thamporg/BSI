package Teste;
import static Teste.TextPerg.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TextResp {
    // Puxar as alternativas de uma pergunta
    public static String[] getAlternativas(int id) {
        String sql = "SELECT op_a, op_b, op_c, op_d FROM questoes WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new String[]{rs.getString("op_a"), rs.getString("op_b"), rs.getString("op_c"), rs.getString("op_d")};
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Comparar alternativa escolhida com a resposta correta usando String
    public static boolean verificarResposta(int id, String escolha) {
        String sql = "SELECT resposta FROM questoes WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("resposta").equalsIgnoreCase(escolha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
