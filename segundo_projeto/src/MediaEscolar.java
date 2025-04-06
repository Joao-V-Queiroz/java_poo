public class MediaEscolar {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao média escolar!");
        // Definindo as variáveis
        String aluno = "João Victor Queiroz Silva";
        double nota1 = 7.5;
        double nota2 = 8.0;
        int media = (int) ((nota1 + nota2) / 2);

        System.out.println("O aluno " + aluno + " obteve as notas " + nota1 + " e " + nota2);
        System.out.println("A média do aluno " + aluno + " é: " + media);
    }
}
