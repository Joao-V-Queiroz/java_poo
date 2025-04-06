public class Carro {
    String modelo;
    int anoDeFabricacao;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoDeFabricacao);
        System.out.println("Cor: " + this.cor);
    }
}
