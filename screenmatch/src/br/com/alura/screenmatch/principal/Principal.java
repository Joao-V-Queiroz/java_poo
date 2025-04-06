package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());

        Serie serie = new Serie("The Big Bang Theory", 2007);
        serie.setTemporadas(12);
        serie.setEpisodiosPorTemporada(24);
        serie.setMinutosPorEpisodio(22);
        System.out.println("Tempo para maratonar a série " +
                serie.getNome() + ": " + serie.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(favorito);
        System.out.println("Tempo total de filmes agregados: " + calculadoraDeTempo.getTempoTotal());

        Filme novoFilme = new Filme("Hobbit - A Batalha dos Cinco Exércitos", 2014);
        novoFilme.setDuracaoEmMinutos(144);
        favorito.setIncluidoNoPlano(true);
        calculadoraDeTempo.inclui(novoFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println("Tempo total de filmes agregados: " + calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);
        filtro.filtra(novoFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("The Pilot");
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(150);
        System.out.println("Número do episódio: " + episodio.getNumero());
        System.out.println("Nome do episódio: " + episodio.getNome());
        System.out.println("Série do episódio: " + episodio.getSerie().getNome());
        System.out.println("Total de visualizações do episódio: " + episodio.getTotalVisualizacoes());
        System.out.println("Classificação do episódio: " + episodio.getClassificacao());
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("O primeiroo filme da lista é: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.toString());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

    }

}