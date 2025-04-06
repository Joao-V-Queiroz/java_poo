import br.com.alura.desafioorientacaoobjeto2.modelos.*;

public class Principal {
    public static void main(String[] args) {
        // Trabalhando com objeto do tipo conta bancária
        ContaBancaria newConta = new ContaBancaria();
        newConta.setNumeroConta("12345-6");
        newConta.titular = "João da Silva";
        newConta.depositar(1000.0);
        System.out.println(newConta.toString());

        // Trabalhando com objeto do tipo Aluno
        Aluno aluno = new Aluno("Taynara Mendes de Oliveira");
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(9.0);
        aluno.adicionarNota(7.5);
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println(aluno.exibeMedia());

        // Trabalhando com o objeto do tipo IdadePessoa
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Tatiana Guimarães");
        idadePessoa.setIdade(46);
        System.out.println("Nome: " + idadePessoa.getNome());
        System.out.println("Idade: " + idadePessoa.getIdade());
        idadePessoa.verificarIdade(idadePessoa.getIdade());

        // Trabalhando com o objeto do tipo Livro
        Livro livro = new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.exibirDetalhes();

        // Trabalhando com o objeto do tipo Produto
        Produto produto = new Produto();
        produto.setNome("Playstation 5");
        produto.setPreco(3.900);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço original: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto: " + produto.getPreco());
    }
}