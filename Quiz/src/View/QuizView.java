package View;

import Model.Questao;
import javax.swing.*;
import java.util.List;

public class QuizView {

    // Exibe o placar
    public void exibirPlacar(List<String> placar) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Placar ===\n");
        for (String p : placar) {
            sb.append(p).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Placar", JOptionPane.INFORMATION_MESSAGE);
    }

    // Exibe a pergunta, as opções e pede a resposta do usuário
    public String exibirQuestao(Questao questao) {
        StringBuilder sb = new StringBuilder();
        sb.append(questao.getPergunta()).append("\n");
        for (String option : questao.getOpcoes()) {
            sb.append(option).append("\n");
        }
        
        String resposta = JOptionPane.showInputDialog(
                null, 
                sb.toString() + "\nDigite a alternativa (a, b, c ou d):", 
                "Questão", 
                JOptionPane.QUESTION_MESSAGE);

        // Caso o usuário cancele ou deixe em branco, retornamos null
        return (resposta != null && !resposta.trim().isEmpty()) ? resposta.toLowerCase() : null;
    }

    // Exibe uma mensagem de feedback após a resposta
    public void exibirFeedback(String feedback) {
        JOptionPane.showMessageDialog(null, feedback, "Feedback", JOptionPane.INFORMATION_MESSAGE);
    }

    // Solicita o nome do jogador
    public String pedirNome() {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome para salvar o placar:", "Nome", JOptionPane.QUESTION_MESSAGE);
        return nome != null ? nome : "Jogador Desconhecido";  // Caso o jogador clique em Cancelar
    }

    // Exibe o resultado final
    public void exibirResultado(int score, int totalQuestoes) {
        JOptionPane.showMessageDialog(null, 
                String.format("Seu placar final foi = %d/%d", score, totalQuestoes), 
                "Resultado", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Pergunta se o usuário deseja repetir o quiz
    public boolean perguntarSeRepetir() {
        int resposta = JOptionPane.showConfirmDialog(null, 
                "Deseja repetir o quiz?", 
                "Repetir Quiz", 
                JOptionPane.YES_NO_OPTION);
        return resposta == JOptionPane.YES_OPTION;
    }

    // Exibe mensagem de saída
    public void exibirMensagemSaida() {
        JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Saída", JOptionPane.INFORMATION_MESSAGE);
    }
}
