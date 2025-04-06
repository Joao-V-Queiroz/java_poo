package br.com.joaodesafio.modelos;

public class Cachorro extends Animal {
    private String raca;
    private String corPelo;

    public Cachorro(String especie, String tipoAlimentacao, String habitat, String raca, String corPelo) {
        super(especie, tipoAlimentacao, habitat);
        this.raca = raca;
        this.corPelo = corPelo;
    }

    public String getRaca() {
        return raca;
    }

    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }
}
