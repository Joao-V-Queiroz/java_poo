package br.com.joaodesafio.modelos;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double precoMedio(ArrayList<Produto> produtos) {
        double soma = 0;
        double media = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
            media = soma / produtos.size();
        }
        return media;
    }

}
