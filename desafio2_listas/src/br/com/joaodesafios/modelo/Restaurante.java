package br.com.joaodesafios.modelo;

import java.util.ArrayList;

public class Restaurante extends Estabelecimento {

    private String horarioFuncionamento;
    private ArrayList<String> cardapio = new ArrayList<>();
    private String especialidadeCulinaria;
    private boolean entrega;
    private String tipoPagamento; // posso usar o tipo vale alimentação, para diferenciar o método de comprar

    public Restaurante(String nomeFantasia, String razaoSocial, String cnpj, String endereco,
                       String horarioFuncionamento, String especialidadeCulinaria, boolean entrega,
                       String tipoPagamento) {
        super(nomeFantasia, razaoSocial, cnpj, endereco);
        this.horarioFuncionamento = horarioFuncionamento;
        this.especialidadeCulinaria = especialidadeCulinaria;
        this.entrega = entrega;
        this.tipoPagamento = tipoPagamento;
    }

    public String getEspecialidadeCulinaria() {
        return especialidadeCulinaria;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void adicionarItemCardapio(String item) {
        cardapio.add(item);
        System.out.println("Item " + item + " adicionado ao cardápio.");
    }

    public void removerItemCardapio(String item) {
        if (cardapio.remove(item)) {
            System.out.println("Item " + item + " removido do cardápio.");
        } else {
            System.out.println("Item " + item + " não encontrado no cardápio.");
        }
    }

    public void mostrarCardapio() {
        System.out.println("Cardápio:");
        for (String item : cardapio) {
            System.out.println("- " + item);
        }
    }

    public void entregaPedido() {
        if (entrega) {
            System.out.println("Sim, nós fazemos entrega.");
        } else {
            System.out.println("Não, nós não fazemos entrega.");
        }
    }

}
