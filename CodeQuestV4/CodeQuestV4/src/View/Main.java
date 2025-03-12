package View;

import Controller.QuizController;

public class Main {

    public static void main(String[] args) {
        QuizView view = new QuizView();
        QuizController controller = new QuizController(view);
        controller.iniciarQuiz();
    }
}
