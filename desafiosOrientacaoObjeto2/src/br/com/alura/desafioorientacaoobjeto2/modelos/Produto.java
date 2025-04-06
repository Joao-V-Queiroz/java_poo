package br.com.alura.desafioorientacaoobjeto2.modelos;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            double desconto = (preco * porcentagem) / 100;
            preco -= desconto;
        } else {
            System.out.println("Porcentagem inválida");
        }
    }
}
