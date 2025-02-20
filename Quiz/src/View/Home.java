import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

    public Home() {
        // Definir o título da janela
        setTitle("Tela com Logo");

        // Configurar o layout da janela para null para posicionar manualmente os componentes
        setLayout(null);

        // Tentar carregar a imagem do logo de um caminho absoluto
        ImageIcon logo = null;

        // Usar o caminho relativo correto
        try {
            logo = new ImageIcon(getClass().getResource("/resources/logo.png"));  // Caminho se a imagem estiver na pasta 'src/resources'

            if (logo.getIconWidth() == -1) {
                System.out.println("Imagem não encontrada. Verifique o caminho.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }

        // Se a imagem for carregada com sucesso, crie o JLabel
        if (logo != null) {
            // Reduzir a imagem para 70% do tamanho original (ajuste de escala)
            int larguraLogo = logo.getIconWidth();
            int alturaLogo = logo.getIconHeight();
            int novaLargura = (int) (larguraLogo * 0.7);  // Reduzir para 70% do tamanho original
            int novaAltura = (int) (alturaLogo * 0.7);    // Reduzir para 70% do tamanho original

            // Criar uma nova imagem com o novo tamanho
            Image imagemReduzida = logo.getImage().getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            ImageIcon logoReduzido = new ImageIcon(imagemReduzida);

            JLabel labelLogo = new JLabel(logoReduzido);

            // Definir a posição para centralizar a imagem na tela
            int x = (getWidth() - novaLargura) / 2;  // Centraliza horizontalmente
            int y = 99;  // Definir a posição fixa para o topo da imagem
            labelLogo.setBounds(x, y, novaLargura, novaAltura);  // Definir a posição e o tamanho da imagem

            // Adicionar o JLabel ao JFrame
            add(labelLogo);
        }

        // Estilização do botão "Jogar"
        JButton btnJogar = new JButton("Jogar");
        btnJogar.setBounds(150, 400, 300, 62);  // Posição e tamanho do botão

        // Estilos para o botão "Jogar"
        btnJogar.setFont(new Font("Jaro", Font.PLAIN, 48));  // Fonte
        btnJogar.setForeground(new Color(123, 123, 123));  // Cor do texto (#7B7B7B)
        btnJogar.setBackground(new Color(217, 217, 217));  // Cor de fundo (#D9D9D9)
        btnJogar.setFocusPainted(false);  // Remove a borda de foco ao clicar
        btnJogar.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217), 5));  // Borda
        btnJogar.setOpaque(true);

        // Borda arredondada
        btnJogar.setBorder(BorderFactory.createCompoundBorder(
            btnJogar.getBorder(),
            BorderFactory.createEmptyBorder(0, 0, 0, 0)
        ));

        // Adicionar o botão "Jogar" ao JFrame
        add(btnJogar);

        // Estilização do botão "Placar"
        JButton btnPlacar = new JButton("Placar");
        btnPlacar.setBounds(150, 480, 300, 62);  // Posição e tamanho do botão

        // Estilos para o botão "Placar"
        btnPlacar.setFont(new Font("Jaro", Font.PLAIN, 48));  // Fonte
        btnPlacar.setForeground(new Color(123, 123, 123));  // Cor do texto (#7B7B7B)
        btnPlacar.setBackground(new Color(217, 217, 217));  // Cor de fundo (#D9D9D9)
        btnPlacar.setFocusPainted(false);  // Remove a borda de foco ao clicar
        btnPlacar.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217), 5));  // Borda
        btnPlacar.setOpaque(true);

        // Borda arredondada
        btnPlacar.setBorder(BorderFactory.createCompoundBorder(
            btnPlacar.getBorder(),
            BorderFactory.createEmptyBorder(0, 0, 0, 0)
        ));

        // Adicionar o botão "Placar" ao JFrame
        add(btnPlacar);

        // Configurar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajustar o tamanho da janela para garantir que a imagem caiba completamente
        setSize(800, 600);  // Ajuste aqui conforme necessário para garantir que a imagem e os botões fiquem visíveis

        setVisible(true);

        // Centralizar a janela na tela
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Executar a criação da janela
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home();
            }
        });
    }
}
