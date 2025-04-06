import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 0; // contador de tentativas
        int maximoTentativas = 5; // número máximo de tentativas
        int palpite; // variável para armazenar o palpite do usuário
        boolean acertou = false;
        String nomeJogador;

        System.out.println("Bem vindo(a) ao jogo de adivinhação!");
        System.out.println("Qual seu nome jogador?");
        nomeJogador = leitura.nextLine();
        System.out.println("Olá " + nomeJogador + ", você tem " + maximoTentativas +
                " tentativas para adivinhar o número entre 1 e 100. Boa sorte!");

        for (int i = 0; i < maximoTentativas; i++) {
            System.out.println("Digite um número entre 1 e 100:");
            palpite = leitura.nextInt();
            leitura.nextLine();  // Consumir a quebra de linha após o nextInt()

            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um valor entre 1 e 100.");
                continue; // Não incrementa tentativas se o palpite for inválido
            }

            tentativas++;  // Incrementa o contador de tentativas para palpite válido
            System.out.println("Você tentou o número: " + palpite);

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! " + nomeJogador + ", você acertou o número em " +
                        tentativas + " tentativas!");
                acertou = true;
                break; // Encerra o laço caso o jogador acerte
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número que você tentou é menor que o número aleatório.");
            } else {
                System.out.println("O número que você tentou é maior que o número aleatório.");
            }
        }

        // Se não acertou e usou todas as tentativas
        if (!acertou) {
            System.out.println("Você não acertou o número. O número era: " + numeroAleatorio);
        }
    }
}
