package br.com.joaodesafio.principal;

import br.com.joaodesafio.interfaces.Forma;
import br.com.joaodesafio.modelos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<>();
        times.add("Vasco da Gama");
        times.add("Flamengo");
        times.add("São Paulo");
        times.add("Palmeiras");
        times.add("Santos");
        times.add("Corinthians");

        times.forEach(time -> System.out.println("Time: " + time));
        System.out.println("Número total de times cadastrados: " + times.size());

        Cachorro fiona = new Cachorro("Cachorro", "Carnívoro", "Doméstico", "Labrador", "Amarelo");
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(fiona);

        for (Animal animal : animais) {
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Tipo de Alimentação: " + animal.getTipoAlimentacao());
            System.out.println("Habitat: " + animal.getHabitat());
            if (animal instanceof Cachorro cao) {
                System.out.println("Raça: " + cao.getRaca());
                System.out.println("Cor do Pelo: " + cao.getCorPelo());
                cao.fazerBarulho();
            } else {
                animal.fazerBarulho();
            }

            Produto bolaFutebol = new Produto("Bola de Futebol", 99.90);
            Produto camisaTime = new Produto("Camisa do Time", 199.90);
            Produto chuteira = new Produto("Chuteira", 299.90);
            ArrayList<Produto> produtos = new ArrayList<>();
            produtos.add(bolaFutebol);
            produtos.add(camisaTime);
            produtos.add(chuteira);
            for (Produto produto : produtos) {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Preço: R$ " + produto.getPreco());
            }
            System.out.println("Preço médio dos produtos: R$ " + bolaFutebol.precoMedio(produtos));

            Circulo primeiroCirculo = new Circulo(5);
            Circulo segundoCirculo = new Circulo(10);
            Quadrado primeiroQuadrado = new Quadrado(4);
            Quadrado segundoQuadrado = new Quadrado(8);
            ArrayList<Forma> formas = new ArrayList<>();
            formas.add(primeiroCirculo);
            formas.add(segundoCirculo);
            formas.add(primeiroQuadrado);
            formas.add(segundoQuadrado);
            for (Forma forma : formas) {
                if (forma instanceof Circulo
                        circulo) {
                    System.out.println("O valor do raio do círculo é: " + circulo.getRaio());
                    System.out.println("O valor da área é : " + circulo.calcularArea());
                } else if (forma instanceof Quadrado quadrado) {
                    System.out.println("O valor do lado do quadrado é: " + quadrado.getLado());
                    System.out.println("O valor da área é : " + quadrado.calcularArea());
                }
            }
        }
    }
}