public class Aluno {
    
    private String nome;
    private int idade;
    private float nota;
    private String turma;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int idade, float nota, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.turma = turma;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public float getNota() {return nota;}
    public void setNota(float nota) {this.nota = nota;}

    public String getTurma() {return turma;}
    public void setturma(String turma) {this.turma = turma;}
    
    public String toString() {
        return this.nome;
    }
}
