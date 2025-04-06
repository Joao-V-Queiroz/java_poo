public class Cliente {
    public String nome;
    public String tipoConta;
    public double saldoInicial;

    public Cliente(String nome, String tipoConta, double saldoInicial) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldoInicial = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String extratoConta() {
        return String.format("""
                ******** EXTRATO CONTA ********
                Nome:       %s
                Tipo conta: %s
                Saldo:      R$ %.2f
                *******************************
                """, nome, tipoConta, saldoInicial);
    }

}
