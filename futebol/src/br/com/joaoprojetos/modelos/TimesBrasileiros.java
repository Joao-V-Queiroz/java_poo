package br.com.joaoprojetos.modelos;

import br.com.joaoprojetos.interfaces.TimeCadastrado;

public class TimesBrasileiros extends Time implements TimeCadastrado {

    private String estado;

    public TimesBrasileiros(String nome, String pais, String cidade, String estadio, int anoFundacao, int titulosNacionais, int titulosInternacionais, String estado) {
        super(nome, pais, cidade, estadio, anoFundacao, titulosNacionais, titulosInternacionais);
        this.estado = estado;
    }

    // Getter e Setter para 'estado'
    public String getEstado() {
        return estado;
    }

    @Override
    public void imprimirTimeCadastrado() {
        System.out.println("Seja muito bem-vindo " + getNome() + "!");
        System.out.println("Os seguintes dados foram cadastrados:");
        System.out.println("==========================");
        System.out.println("Nome do time: " + getNome());
        System.out.println("País: " + getPais());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("Estádio: " + getEstadio());
        System.out.println("Ano de fundação: " + getAnoFundacao());
        System.out.println("Número de títulos nacionais: " + getTitulosNacionais());
        System.out.println("Número de títulos internacionais: " + getTitulosInternacionais());
        System.out.println("==========================");
    }

    @Override
    public void mensagemDeSucesso() {
        System.out.println("Cadastro realizado com sucesso!");
    }
}

