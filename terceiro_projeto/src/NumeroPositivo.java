import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        String nomeUsuario;
        boolean novoNumero = false;

        System.out.println("Bem vindo! Este programa verifica se um número é positivo ou negativo.");
        System.out.println("Qual seu nome?");
        nomeUsuario = leitura.nextLine();
        System.out.println("Olá " + nomeUsuario + ", vamos começar!");

        do {
            System.out.println("Digite um número inteiro, positivo ou negativo:");
            numero = leitura.nextInt();
            leitura.nextLine(); // Consumir a quebra de linha após o nextInt()
            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo.");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
            System.out.println("Você deseja verificar outro número? (S/N)");
            String resposta = leitura.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                novoNumero = true;
            } else if (resposta.equalsIgnoreCase("N")) {
                novoNumero = false;
                System.out.println("Obrigado por usar o programa, " + nomeUsuario + "!");
            } else {
                System.out.println("Resposta inválida. Por favor, digite S ou N.");
            }
        } while (novoNumero);
    }
}
