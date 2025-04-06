package br.com.joaodesafio.modelos;

import br.com.joaodesafio.interfaces.Forma;

public class Quadrado implements Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
