package br.com.joaodesafios.modelos;

public class Pessoa {
    String nome;
    String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + "(" + idade + " anoss)";
    }
}
