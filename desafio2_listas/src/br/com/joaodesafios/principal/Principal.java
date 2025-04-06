package br.com.joaodesafios.principal;

import br.com.joaodesafios.CompraProduto;
import br.com.joaodesafios.modelo.Restaurante;
import br.com.joaodesafios.modelo.Varejo;

public class Principal {
    public static void main(String[] args) {

        Restaurante gyga = new Restaurante("Gyga", "Gyga Ltda", "12345678901234", "Rua das Flores, 123",
                "10:00 - 22:00", "Comida Japonesa", false, "Cartão de Crédito");
        Varejo novoMundo = new Varejo("Novo Mundo", "Novo Mundo Ltda", "98765432109876", "Avenida Brasil, 456",
                "08:00 - 20:00", "Eletrodomesticos", "Dinheiro");
        CompraProduto compraProduto = new CompraProduto();

        gyga.entregaPedido();
        gyga.adicionarItemCardapio("Rodízio de costela");
        gyga.adicionarItemCardapio("Refrigerante");
        gyga.mostrarCardapio();

        novoMundo.adicionarProduto("Geladeira");
        novoMundo.adicionarProduto("Fogão");
        novoMundo.mostrarProdutos();

        compraProduto.comprandoProduto(gyga);
        compraProduto.comprandoProduto(novoMundo);

    }
}