package br.com.alura.screenmatch.modelos;

// Classe para mapear os dados do JSON retornado pela API
public record TituloOmdb(String title, String year, String runtime) {
}
