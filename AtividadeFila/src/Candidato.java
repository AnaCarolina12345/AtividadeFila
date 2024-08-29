public class Candidato {

    private String nome;
    private String operacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getoperacao() {
        return operacao;
    }

    public Candidato(String nome, String operacao) {
        this.nome = nome;
        this.operacao = operacao;
    }

    public void setoperacao(String operacao) {
        this.operacao = operacao;

    }
}
