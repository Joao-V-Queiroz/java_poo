import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeUsuario;
        String resposta;
        int escolhaMenu;
        boolean novoCalculo = false;
        // Variáveis para o cálculo da área do círculo
        double pi = 3.14;
        double raio;
        double areaCirculo;
        // Variáveis para o cálculo da área do quadrado
        double lado;
        double areaQuadrado;

        System.out.println("Olá, seja bem-vindo ao programa de cálculo de área!");
        System.out.println("Qual é o seu nome?");
        nomeUsuario = leitura.nextLine();
        System.out.println("Olá " + nomeUsuario + ", vamos começar!");

        do {
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            escolhaMenu = leitura.nextInt();
            leitura.nextLine(); // Consumir a quebra de linha após o nextInt()

            if (escolhaMenu == 1) {
                System.out.println("Você escolheu calcular a área do quadrado.");
                System.out.println("Qual é o valor do lado do quadrado?");
                lado = leitura.nextDouble();
                leitura.nextLine(); // Consumir a quebra de linha após o nextDouble()
                areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
            } else if (escolhaMenu == 2) {
                System.out.println("Você escolheu calcular a área do círculo.");
                System.out.println("Qual é o valor do raio do círculo?");
                raio = leitura.nextDouble();
                leitura.nextLine(); // Consumir a quebra de linha após o nextDouble()
                areaCirculo = pi * (raio * raio);
                System.out.println("A área do círculo é: " + areaCirculo);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Você gostaria de fazer outro cálculo? (s/n)");
            resposta = leitura.nextLine();  // Agora essa leitura vai funcionar corretamente.

            if (resposta.equalsIgnoreCase("s")) {
                novoCalculo = true;
            } else if (resposta.equalsIgnoreCase("n")) {
                novoCalculo = false;
                System.out.println("Obrigado por usar o programa de cálculo de área. Até logo!");
            } else {
                System.out.println("Resposta inválida. O programa será encerrado.");
                novoCalculo = false;
            }

        } while (novoCalculo);

    }
}
