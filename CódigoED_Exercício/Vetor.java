import javax.swing.JOptionPane;

public class Vetor {

    private Aluno[] alunos = new Aluno[100000];
    private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
    for (int i = 0; i < this.alunos.length; i++) {
        if (this.alunos[i] == null) {
            this.alunos[i] = aluno;
            this.totalDeAlunos++;
            break;
            }
        }
    }

	public void adiciona(int posicao, Aluno aluno) {
        
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }
    
    private boolean posicaoOcupada(int posicao) {
            return posicao >= 0 && posicao < this.totalDeAlunos;
        }
	public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");}
        return this.alunos[posicao];
    }
        
    
	public void remove(int posicao) {
        if (posicaoOcupada(posicao)) {
            this.alunos[posicao] = null;
            for (int i=posicao; i<(this.totalDeAlunos-1); i++) {
                this.alunos[i] = this.alunos[i+1];
            }
            this.totalDeAlunos--;
        }
    }

	public boolean contem(Aluno aluno) {
        for (int i=0;i<this.totalDeAlunos; i++) {
            if (this.alunos[i].getNome().equalsIgnoreCase(aluno.getNome())) {return true;}
        }
        return false;
    }

	public int tamanho() {
        return this.totalDeAlunos;
    }

	public String toString() {
        if (this.totalDeAlunos == 0) {return "[]";}

        StringBuilder textoEditado = new StringBuilder();
        textoEditado.append("[");

        for (int i=0;i<(this.totalDeAlunos-1);i++) {
            textoEditado.append(alunos[i] + ", ");
        }
        textoEditado.append(alunos[totalDeAlunos-1]+"]");
        return textoEditado.toString();
    }

    public static void main(String args[]) {

        Vetor vetor = new Vetor();

        /*long inicio = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            Aluno aluno = new Aluno("Aluno no."+i);
            vetor.adiciona(aluno);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000;
        JOptionPane.showMessageDialog(null, tempo + "Segundos");
        JOptionPane.showMessageDialog(null, vetor.toString());
*/
        
        vetor.adiciona(new Aluno("Alfa"));
        vetor.adiciona(new Aluno("Beta"));
        vetor.adiciona(new Aluno("Charlie"));

        int exec = 10;
        while (exec != 0) {exec = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n\n"+
                                    "[1] Adicionar um novo aluno (no fim da lista)\n"+
                                    "[2] Adicionar um novo aluno (em um local específico)\n"+
                                    "[3] Método Pega\n"+
                                    "[4] Remover algum aluno da lista\n"+
                                    "[5] Checar se contem um aluno com determinado nome\n"+
                                    "[6] Checar o tamanho\n"+
                                    "[7] Checar lista de alunos\n\n"+
                                    "[0] Encerrar"));
        
                switch (exec) {
                    case 1: //Método Adiciona (No final)
                        vetor.adiciona(new Aluno(JOptionPane.showInputDialog("Qual o nome do aluno?")));
                        break;

                    case 2: //Método Adiciona (No meio)
                        int posiTempo = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição que deseja?"));
                        vetor.adiciona((posiTempo+1), new Aluno(JOptionPane.showInputDialog("Qual o nome do aluno?")));
                        break;

                    case 3: //Método Pega()
                        posiTempo = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição que deseja?"));
                        JOptionPane.showMessageDialog(null, "O aluno nessa posição é: "+vetor.pega((posiTempo+1)));
                        break;

                    case 4: //Método Remove()
                        posiTempo = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição que deseja?"));
                        JOptionPane.showMessageDialog(null, "Você removeu "+vetor.pega((posiTempo+1))+" da lista");
                        vetor.remove((posiTempo+1));
                        break;

                    case 5: //Método Contem()
                        boolean achou = vetor.contem(new Aluno(JOptionPane.showInputDialog(null, "Qual o nome que deseja buscar?")));
                        JOptionPane.showMessageDialog(null, achou ? "Aluno encontrado!" : "Aluno não encontrado!");
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Tamanho atual: " + vetor.tamanho());
                        break;
                        
                    case 7:
                        JOptionPane.showMessageDialog(null, vetor.toString());
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null, "Encerrando programa...");
                        break;

                    default:
                        if (exec == 0) {
                            JOptionPane.showMessageDialog(null, "Encerrando programa...");
                            break;}
                        else {JOptionPane.showMessageDialog(null, "Número inválido");}
                    }
        }
   
    }

}