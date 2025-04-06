public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    void saudarPessoa(String nome, String saudacao) {
        this.nome = nome;
        System.out.println(saudacao + " " + this.nome);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
