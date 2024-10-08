public class Aluno {
    
    private String  nome;
    private int     idade;
    private float   nota;
    private String  turma;

    //construtor
    public Aluno(String nome, int idade, float nota, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.turma = turma;
    }

    //gets e sets
    public Aluno(){}
    
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double getNota() {return nota;}
    public void setNota(float nota) {this.nota = nota;}

    public String getTurma() {return turma;}
    public void setTurma(String turma) {this.turma = turma;}
    
    
    public String toString(){
        return this.nome+" : "+this.turma;
    }
    
    //Função equals (comparar duas informações)
    public boolean equals(Aluno aa){
        //return nome.equals( aa.getNome());
        return idade == aa.getIdade();
    }

}
