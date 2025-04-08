package br.com.alura.screenmatch.excecoes;

public class ErroFormatoDeAnoException extends RuntimeException {

    private String mensagem;

    public ErroFormatoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
