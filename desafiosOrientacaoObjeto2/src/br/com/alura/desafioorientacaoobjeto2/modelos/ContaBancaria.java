package br.com.alura.desafioorientacaoobjeto2.modelos;

public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    public String titular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0 && numeroConta != null) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }

    /*
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     */
}
