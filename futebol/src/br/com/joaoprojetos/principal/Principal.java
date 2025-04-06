package br.com.joaoprojetos.principal;

import br.com.joaoprojetos.modelos.CadastrarTime;
import br.com.joaoprojetos.modelos.Time;
import br.com.joaoprojetos.modelos.TimesBrasileiros;

public class Principal {
    public static void main(String[] args) {
        System.out.println("========== Sistema de Times de Futebol ==========");
        CadastrarTime cadastrarTime = new CadastrarTime();

        // Cadastra o time e obtém o objeto retornado
        Time time = cadastrarTime.cadastrarTime();

        // Verifica se o time é um objeto do tipo TimesBrasileiros
        if (time instanceof TimesBrasileiros) {
            TimesBrasileiros timeBrasileiro = (TimesBrasileiros) time;
            timeBrasileiro.mensagemDeSucesso();
            timeBrasileiro.imprimirTimeCadastrado();
        } else {
            System.out.println("Time internacional cadastrado com sucesso!");
            System.out.println("Nome do time: " + time.getNome());
            System.out.println("País: " + time.getPais());
        }

        System.out.println("=================================================");
    }
}
