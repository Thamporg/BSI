
package Teste;
import java.sql.*;
import javax.swing.JOptionPane;
public class Mainsla {
// Classe principal para testar os métodos
    public static void main(String[] args) {
        
        for (int i = 0; i<13; i++){
        int idPergunta = i; // Exemplo de ID
        
        // Exibir pergunta e alternativas no console
        String pergunta = TextPerg.getPergunta(idPergunta);
        String[] alternativas = TextResp.getAlternativas(idPergunta);
        String escolha = null;
        
        if (alternativas != null) {
            escolha = JOptionPane.showInputDialog("Pergunta " + i + ": " + pergunta + "\n" + 
                    "A) " + alternativas[0] + "\n" + 
                    "B) " + alternativas[1] + "\n" + 
                    "C) " + alternativas[2] + "\n" + 
                    "D) " + alternativas[3]);
            
            if (TextResp.verificarResposta(idPergunta, escolha) == true) {JOptionPane.showMessageDialog(null, "CORRETO!");}
            else {JOptionPane.showMessageDialog(null, "Incorreto");}
        }
    }
}
}