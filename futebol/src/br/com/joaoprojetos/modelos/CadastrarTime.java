package br.com.joaoprojetos.modelos;

import java.util.Scanner;

public class CadastrarTime {

    Scanner leitura = new Scanner(System.in);
    String nomeTime;
    String paisTime;
    String cidadeTime;
    String estadioTime;
    String estadoTime;
    String continenteTime;
    int anoFundacao;
    int titulosNacionais;
    int titulosInternacionais;

    public Time cadastrarTime() {
        System.out.println("Digite o nome do time: ");
        nomeTime = leitura.nextLine();
        System.out.println("Digite a cidade do time: ");
        cidadeTime = leitura.nextLine();
        System.out.println("Digite o estádio do time: ");
        estadioTime = leitura.nextLine();
        System.out.println("Digite o ano de fundação do time: ");
        anoFundacao = leitura.nextInt();
        leitura.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o número de títulos nacionais: ");
        titulosNacionais = leitura.nextInt();
        leitura.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o número de títulos internacionais: ");
        titulosInternacionais = leitura.nextInt();
        leitura.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o país do time: ");
        paisTime = leitura.nextLine();

        if (paisTime.equalsIgnoreCase("Brasil")) {
            System.out.println("Digite o estado do time: ");
            estadoTime = leitura.nextLine();

            return new TimesBrasileiros(nomeTime, paisTime, cidadeTime, estadioTime, anoFundacao, titulosNacionais, titulosInternacionais, estadoTime);
        } else {
            System.out.println("Digite o continente do time: ");
            continenteTime = leitura.nextLine();

            return new RestoDoMundo(nomeTime, paisTime, cidadeTime, estadioTime, anoFundacao, titulosNacionais, titulosInternacionais, continenteTime);
        }
    }

}

