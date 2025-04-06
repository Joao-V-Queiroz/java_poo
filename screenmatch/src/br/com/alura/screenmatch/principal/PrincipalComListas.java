package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2004);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Rachel Zeggler");
        buscarPorArtista.add("Jason Statham");
        buscarPorArtista.add("Robert Pattinson");
        buscarPorArtista.add("Chris Evans");
        System.out.println("Artistas: " + buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordemação: " + buscarPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: " + lista.toString());
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // é um comparator e não um comparable
        System.out.println("Lista de títulos ordenados por ano de lançamento: " + lista.toString());
    }
}
