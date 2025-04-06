import operacoes.Soma;
import operacoes.Subtracao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        // Criando um objeto da classe Estudos
        Estudos matematicaEstudos = new Estudos("Anotações de Matemática", "Matemática");
        System.out.println(matematicaEstudos.toString());

        System.out.println("------------------------");

        int numero1 = 10;
        int numero2 = 5;

        // Criando um objeto da classe Soma
        Soma soma = new Soma(numero1, numero2);
        System.out.println(soma.toString());

        int num1 = 20;
        int num2 = 10;

        Subtracao subtracao = new Subtracao(num1, num2);
        System.out.println(subtracao.toString());
    }
}