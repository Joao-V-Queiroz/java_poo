package br.com.joaodesafio.modelos;

import br.com.joaodesafio.interfaces.Forma;

public class Circulo implements Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
