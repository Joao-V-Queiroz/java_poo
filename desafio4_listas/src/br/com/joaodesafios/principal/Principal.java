package br.com.joaodesafios.principal;

import br.com.joaodesafios.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(10);
        numerosInteiros.add(5);
        numerosInteiros.add(8);
        numerosInteiros.add(7);
        numerosInteiros.add(110);
        numerosInteiros.add(1000);
        numerosInteiros.add(58);
        Collections.sort(numerosInteiros);
        System.out.println("Lista de números inteiros ordenados: " + numerosInteiros);

        Titulo primeiroTitulo = new Titulo("O Poderoso Chefão");
        Titulo segundoTitulo = new Titulo("Avatar");
        Titulo terceiroTitulo = new Titulo("Dogville");
        Titulo quartoTitulo = new Titulo("Lost");
        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(primeiroTitulo);
        listaDeTitulos.add(segundoTitulo);
        listaDeTitulos.add(terceiroTitulo);
        listaDeTitulos.add(quartoTitulo);
        System.out.println("Títulos antes da ordenação: " + listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println("Títulos depois da ordenação: " + listaDeTitulos);
    }
}