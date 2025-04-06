public class Main {
    public static void main(String[] args) {
        // Trabalhando com a classe Pessoa
        Pessoa esposa = new Pessoa("Taynara Mendes");
        String saudacao = "Olá, meu amor!";
        esposa.saudarPessoa(esposa.nome, saudacao);

        // Trabalhando com a classe Calculadora
        Calculadora calculadora = new Calculadora();
        int numero = 5;
        int resultado = calculadora.dobroValor(numero);
        System.out.println("O dobro de " + numero + " é: " + resultado);

        // Trabalhando com a classe Música
        Musica haloBeyonce = new Musica();
        haloBeyonce.titulo = "Halo";
        haloBeyonce.artista = "Beyoncé";
        haloBeyonce.anoDeLancamento = 2008;

        haloBeyonce.exibeFichaMusica();
        haloBeyonce.avaliarMusica(10);
        haloBeyonce.avaliarMusica(8);
        haloBeyonce.avaliarMusica(9);
        haloBeyonce.exibeMediaCalculada();

        // Trabalhando com a classe Carro
        Carro celta = new Carro();
        celta.modelo = "Celta";
        celta.anoDeFabricacao = 2010;
        celta.cor = "Preto";
        celta.exibeFichaTecnica();
    }
}