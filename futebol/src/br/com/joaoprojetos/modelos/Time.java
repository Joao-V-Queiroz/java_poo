package br.com.joaoprojetos.modelos;

public class Time {

    private String nome;
    private String pais;
    private String cidade;
    private String estadio;
    private int anoFundacao;
    private int titulosNacionais;
    private int titulosInternacionais;

    // Construtor
    public Time(String nome, String pais, String cidade, String estadio, int anoFundacao, int titulosNacionais, int titulosInternacionais) {
        this.nome = nome;
        this.pais = pais;
        this.cidade = cidade;
        this.estadio = estadio;
        this.anoFundacao = anoFundacao;
        this.titulosNacionais = titulosNacionais;
        this.titulosInternacionais = titulosInternacionais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public int getTitulosNacionais() {
        return titulosNacionais;
    }

    public int getTitulosInternacionais() {
        return titulosInternacionais;
    }

}
