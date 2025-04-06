package br.com.joaoprojetos.modelos;

import br.com.joaoprojetos.interfaces.TimeCadastrado;

public class RestoDoMundo extends Time implements TimeCadastrado {

    private String continente;

    public RestoDoMundo(String nome, String pais, String cidade, String estadio, int anoFundacao, int titulosNacionais, int titulosInternacionais, String continente) {
        super(nome, pais, cidade, estadio, anoFundacao, titulosNacionais, titulosInternacionais);
        this.continente = continente;
    }

    public String getContinente() {
        return continente;
    }

    @Override
    public void mensagemDeSucesso() {
        System.out.println("Time cadastrado com sucesso!");
    }

    @Override
    public void imprimirTimeCadastrado() {
        System.out.println("Seja muito bem-vindo " + getNome() + "!");
        System.out.println("Os seguintes dados foram cadastrados:");
        System.out.println("==========================");
        System.out.println("Nome do time: " + getNome());
        System.out.println("País: " + getPais());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Continente: " + getContinente());
        System.out.println("Estádio: " + getEstadio());
        System.out.println("Ano de fundação: " + getAnoFundacao());
        System.out.println("Número de títulos nacionais: " + getTitulosNacionais());
        System.out.println("Número de títulos internacionais: " + getTitulosInternacionais());
        System.out.println("==========================");
    }
}
