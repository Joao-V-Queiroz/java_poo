package br.com.joaodesafio.modelos;

public class Animal {
    private String especie;
    private String tipoAlimentacao;
    private String habitat;

    public Animal(String especie, String tipoAlimentacao, String habitat) {
        this.especie = especie;
        this.tipoAlimentacao = tipoAlimentacao;
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public String getHabitat() {
        return habitat;
    }

    public void fazerBarulho() {
        System.out.println("O animal está fazendo barulho.");
    }
}
