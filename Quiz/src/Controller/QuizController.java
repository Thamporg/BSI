package Controller;

import Model.BancoDeDados;
import Model.Questao;
import View.QuizView;
import java.util.*;

public class QuizController {

    private QuizView view;

    public QuizController(QuizView view) {
        this.view = view;
    }

    public void iniciarQuiz() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Exibe o placar
            List<String> placar = BancoDeDados.obterPlacar();
            view.exibirPlacar(placar);

            // Obtém as questões do banco de dados
            List<Questao> questoes = BancoDeDados.obterQuestoes();

            if (questoes.isEmpty()) {
                System.out.println("Nenhuma pergunta encontrada no banco de dados.");
                break;
            }

            // Embaralha as perguntas
            Collections.shuffle(questoes);
            int score = 0;

            // Loop pelas questões
            for (Questao questao : questoes) {
                // Exibe a questão e obtém a resposta
                String resposta = view.exibirQuestao(questao); // Agora chamamos exibirQuestao

                // Caso o usuário decida sair
                if (resposta == null || resposta.equals("sair")) {
                    view.exibirMensagemSaida();
                    return; // Sai do jogo
                }

                // Verifica se a resposta está correta
                if (resposta.equals(questao.getResposta())) {  // Usando o getter
                    view.exibirFeedback("Correto!");
                    score++;
                } else {
                    view.exibirFeedback("Incorreto.");
                }
            }

            view.exibirResultado(score, questoes.size());

            // Solicita nome e salva a pontuação
            String nome = view.pedirNome();
            BancoDeDados.salvarPontuacao(nome, score);

            // Pergunta se deseja repetir o quiz
            if (!view.perguntarSeRepetir()) {
                view.exibirMensagemSaida();
                break;
            }
        }
    }
}
