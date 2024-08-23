public class Candidato {

    private String nome;
    private String interesse;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInteresse() {
        return interesse;
    }

    public Candidato(String nome, String interesse) {
        this.nome = nome;
        this.interesse = interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;


    }
}
