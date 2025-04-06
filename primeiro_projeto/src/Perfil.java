public class Perfil {

    public static String cumprimento(String nome) {
        return "como vai? " + nome;
    }

    public static void main(String[] args) {
        String nome = "João Victor";
        System.out.println("Olá " + nome);
        System.out.println(cumprimento(nome));
    }
}
