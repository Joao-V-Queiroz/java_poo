import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero1;
        int numero2;
        String nomeUsuario;
        String resposta;
        boolean novoTeste = false;

        System.out.println("Bem vindo! Este programa compara dois números inteiros.");
        System.out.println("Qual seu nome?");
        nomeUsuario = leitura.nextLine();
        System.out.println("Olá " + nomeUsuario + ", vamos começar!");

        do {
            System.out.println("Digite o primeiro número inteiro: ");
            numero1 = leitura.nextInt();
            leitura.nextLine();

            System.out.println("Digite o segundo número inteiro: ");
            numero2 = leitura.nextInt();
            leitura.nextLine();

            if (numero1 == numero2) {
                System.out.println("Os números " + numero1 + " e " + numero2 + " são iguais.");
            } else if (numero1 > numero2) {
                System.out.println("O número " + numero1 + " é maior que o número " + numero2 + ".");
            } else {
                System.out.println("O número " + numero2 + " é maior que o número " + numero1 + ".");
            }

            System.out.println("Você gostaria de informar novos números? (s/n)");
            resposta = leitura.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                novoTeste = true;
            } else if (resposta.equalsIgnoreCase("n")) {
                novoTeste = false;
                System.out.println("Obrigado por usar o programa, " + nomeUsuario + "!");
            } else {
                System.out.println("Resposta inválida. Por favor, digite 's' para sim ou 'n' para não.");
            }

        } while (novoTeste);

    }
}
