public class Executar {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Andre", 1, 1, "Turma A");
        Aluno aluno2 = new Aluno("Beto", 2, 2, "Turma B");
        Aluno aluno3 = new Aluno("Carlos", 1, 3, "Turma C");
        
        if (aluno1.equals(aluno3)) {
        System.out.println("Aluno 1 = Aluno 3");
        }
    }
    
}
