import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String filme = leitura.nextLine();
        int anoDeLancamento = leitura.nextInt();
        double avaliacao = leitura.nextDouble();

        System.out.println("Digite seu filme favorito:");
        System.out.println("O seu filme favorito é: " + filme);
        System.out.println("Digite o ano de lançamento do filme:");
        System.out.println("O ano de lançamento do filme é: " + anoDeLancamento);
        System.out.println("A avaliação do filme é: " + avaliacao);
    }
}
