import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        double mediaAvaliacao = 0; // Inicializar uma variável que será usada para ser incrementada é uma boa prática
        double nota = 0; // Inicializar a variável nota para evitar erros de compilação

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua nota para o filme:");
            nota = let.nextDouble();
            mediaAvaliacao += nota; // Somando as notas, cada vez que o loop roda
        }

        System.out.println("Média de avaliações do filme: " + (mediaAvaliacao / 3));

    }
}
