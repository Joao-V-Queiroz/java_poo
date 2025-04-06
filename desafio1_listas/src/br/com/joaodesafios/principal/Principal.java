package br.com.joaodesafios.principal;

import br.com.joaodesafios.modelos.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nomePessoa;
        String idadePessoa;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int minimoPessoas = 3;

        for (int i = 0; i < minimoPessoas; i++) {
            System.out.println("Digite o nome da pessoa: ");
            nomePessoa = leitura.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            idadePessoa = leitura.nextLine();

            Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);
            pessoas.add(pessoa);
        }

        System.out.println("Tamanho da lista de pessoas: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0).getNome());
        System.out.println("Lista completa de pessoas: " + pessoas);

    }
}