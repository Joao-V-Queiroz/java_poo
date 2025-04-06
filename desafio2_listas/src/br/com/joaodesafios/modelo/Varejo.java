package br.com.joaodesafios.modelo;

import java.util.ArrayList;

public class Varejo extends Estabelecimento {

    private ArrayList<String> produtosDisponiveis = new ArrayList<>();
    private String horarioFuncionamento;
    private String tipoVarejo; // Ex: supermercado, loja de roupas, etc.
    private String tipoPagamento; // Ex: cartão de crédito, débito, dinheiro, etc.

    public Varejo(String nomeFantasia, String razaoSocial, String cnpj, String endereco,
                  String horarioFuncionamento, String tipoVarejo, String tipoPagamento) {
        super(nomeFantasia, razaoSocial, cnpj, endereco);
        this.horarioFuncionamento = horarioFuncionamento;
        this.tipoVarejo = tipoVarejo;
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoVarejo() {
        return tipoVarejo;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public ArrayList<String> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public void adicionarProduto(String produto) {
        produtosDisponiveis.add(produto);
        System.out.println("Produto " + produto + " adicionado ao estoque.");
    }

    public void removerProduto(String produto) {
        if (produtosDisponiveis.remove(produto)) {
            System.out.println("Produto " + produto + " removido do estoque.");
        } else {
            System.out.println("Produto " + produto + " não encontrado no estoque.");
        }
    }

    public void mostrarProdutos() {
        System.out.println("Produtos disponíveis:");
        for (String produto : produtosDisponiveis) {
            System.out.println(" - " + produto);
        }
    }
}
