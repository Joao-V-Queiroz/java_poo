package operacoes;

public class Soma {

    public int numero1;
    public int numero2;

    public Soma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // getters e setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int calcularSoma() {
        return numero1 + numero2;
    }

    public String toString() {
        return "Soma: " + numero1 + " + " + numero2 + " = " + calcularSoma();
    }

}
