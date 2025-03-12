package Model;

import java.sql.*;
import java.util.*;

public class BancoDeDados {

    private static final String URL = "jdbc:mysql://localhost:3307/quiz";
    private static final String USER = "root";
    private static final String PASSWORD = "ifbaiano";

    // Método para obter as questões do banco de dados
    public static List<Questao> obterQuestoes() {
        List<Questao> questoes = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM questoes";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String questionText = rs.getString("pergunta");
                    String[] options = {
                        "a) " + rs.getString("op_a"),
                        "b) " + rs.getString("op_b"),
                        "c) " + rs.getString("op_c"),
                        "d) " + rs.getString("op_d")
                    };
                    String correctAnswer = rs.getString("resposta");
                    questoes.add(new Questao(questionText, options, correctAnswer));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return questoes;
    }

    // Método para salvar a pontuação no banco de dados
    public static void salvarPontuacao(String nome, int score) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO placar (nome, pontuacao) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, nome);
                stmt.setInt(2, score);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para exibir o placar
    public static List<String> obterPlacar() {
        List<String> placar = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM placar ORDER BY pontuacao DESC";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    placar.add(rs.getString("nome") + " - " + rs.getInt("pontuacao") + " pontos");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return placar;
    }
}
