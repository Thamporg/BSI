package Model;

public class Questao {
    private String q;  // A pergunta (agora privado)
    private String[] o;  // As opções de resposta (agora privadas)
    private String r;  // A resposta correta (privado)

    public Questao(String q, String[] o, String r) {
        this.q = q;
        this.o = o;
        this.r = r;
    }

    // Getter para a pergunta
    public String getPergunta() {
        return q;
    }

    // Getter para as opções
    public String[] getOpcoes() {
        return o;
    }

    // Getter para a resposta correta
    public String getResposta() {
        return r;
    }
}
