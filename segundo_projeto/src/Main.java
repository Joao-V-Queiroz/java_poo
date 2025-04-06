public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        //System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.5;
        double media = (9.8 + 7.5 + 8.0) / 3;
        String sinopse;

        //System.out.println("O ano de lançamento é: " + anoLancamento);

        sinopse = """
                Filme Top Gun: Maverick
                Filme de aventura com galã dos anos 80
                Muito Bom
                Ano de lançamento: """ + anoLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("A classificação do filme é: " + classificacao);

        // Utilizando a classe ConversaoTemperatura
        ConversaoTemperatura conversao = new ConversaoTemperatura(25);
        System.out.println(conversao.imprimirValorConversao());

    }
}