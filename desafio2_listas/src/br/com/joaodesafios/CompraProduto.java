package br.com.joaodesafios;

import br.com.joaodesafios.modelo.Estabelecimento;
import br.com.joaodesafios.modelo.Restaurante;
import br.com.joaodesafios.modelo.Varejo;

public class CompraProduto {

    public void comprandoProduto(Estabelecimento estabelecimento) {
        if (estabelecimento instanceof Restaurante) {
            Restaurante restaurante = (Restaurante) estabelecimento;
            System.out.println("Comprando produto no restaurante: " + restaurante.getNomeFantasia());
        } else if (estabelecimento instanceof Varejo) {
            Varejo varejo = (Varejo) estabelecimento;
            System.out.println("Comprando produto no varejo: " + varejo.getNomeFantasia());
        } else {
            System.out.println("Tipo de estabelecimento desconhecido.");
        }
    }

}
