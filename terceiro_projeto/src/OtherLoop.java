import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        boolean outraNota = true;
        int calculoMediaAvaliacao = 0;
        String resposta;

        // Início do laço principal
        do {
            System.out.println("Digite sua nota para o filme:");
            nota = let.nextDouble();
            mediaAvaliacao += nota;
            totalDeNotas++;
            let.nextLine();

            System.out.println("Você deseja adicionar outra nota? S/N");
            resposta = let.nextLine();

            if (resposta.equals("S") || resposta.equals("s")) {
                outraNota = true;
            } else if (resposta.equals("N") || resposta.equals("n")) {
                outraNota = false;
            } else {
                System.out.println("Resposta inválida. Por favor, digite S ou N.");
            }

        } while (outraNota);

        // Cálculo da média
        calculoMediaAvaliacao = (int) mediaAvaliacao / totalDeNotas;
        System.out.println("Média de avaliações do filme: " + calculoMediaAvaliacao);
    }
}
