public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroAvaliacoes;
    int media;

    void exibeFichaMusica() {
        System.out.println("O título da música é: " + this.titulo);
        System.out.println("O artista da música é: " + this.artista);
        System.out.println("O ano de lançamento da música é: " + this.anoDeLancamento);
    }

    void avaliarMusica(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.avaliacao += nota;
            this.numeroAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    double calculaMediaAvaliacao() {
        if (this.numeroAvaliacoes > 0 && this.avaliacao > 0) {
            this.media = (int) (this.avaliacao / this.numeroAvaliacoes);
            return this.media;
        } else {
            return 0;
        }
    }

    void exibeMediaCalculada() {
        double media = this.calculaMediaAvaliacao();
        if (media > 0) {
            System.out.println("A média de avaliações da música " + this.titulo + " é: " + media);
        } else {
            System.out.println("A música " + this.titulo + " ainda não possui avaliações.");
        }
    }

}
