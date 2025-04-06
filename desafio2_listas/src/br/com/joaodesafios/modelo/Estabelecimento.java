package br.com.joaodesafios.modelo;

public class Estabelecimento {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String endereco;

    public Estabelecimento(String nomeFantasia, String razaoSocial, String cnpj, String endereco) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }
}
