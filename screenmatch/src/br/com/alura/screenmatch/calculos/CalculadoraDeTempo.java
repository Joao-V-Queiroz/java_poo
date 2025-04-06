package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    /// Método para incluir o tempo de um título,
    ///  seja filme ou série ou qualquer subclasse de Titulo
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    /*
    public void inclui(Filme filme) {
        tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui(Serie serie) {
        tempoTotal += serie.getDuracaoEmMinutos();
    }
     */
}
