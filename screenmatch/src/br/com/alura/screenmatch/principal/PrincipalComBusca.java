package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecoes.ErroFormatoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = "938df9ca";
        Scanner leitura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        String arquivoJson = "C:/Users/joaov/Downloads/filmes.json";

        while (true) {
            System.out.println("Digite um filme para buscar ou 'sair' para finalizar: ");
            String nomeDoFilme = leitura.nextLine();

            // Interrompe o loop imediatamente se o usuário digitar "sair"
            if (nomeDoFilme.equalsIgnoreCase("sair")) {
                System.out.println("Lista de filmes buscados:");

                for (Titulo titulo : titulos) {
                    System.out.println(titulo);
                }

                // Salva a lista de filmes em um arquivo JSON
                try (FileWriter escrita = new FileWriter(arquivoJson)) {
                    Gson gson = new GsonBuilder()
                            .setPrettyPrinting()
                            .create();
                    escrita.write(gson.toJson(titulos));
                    System.out.println("Arquivo JSON criado com sucesso em: " + arquivoJson);
                } catch (IOException e) {
                    System.out.println("Erro ao salvar os filmes no arquivo: " + e.getMessage());
                }

                System.out.println("O programa finalizou corretamente!");
                break;
            }

            if (nomeDoFilme.isEmpty()) {
                System.out.println("Você não digitou nada, tente novamente.");
                continue;
            }

            // Codifica o nome do filme para a URL
            String nomeCodificado = URLEncoder.encode(nomeDoFilme, StandardCharsets.UTF_8);
            String url = "https://www.omdbapi.com/?t=" + nomeCodificado + "&apiKey=" + apiKey;

            try {
                // Consome a API em Java
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                // Deserializa o JSON
                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .setPrettyPrinting()
                        .create();

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                titulos.add(meuTitulo);

            } catch (Exception e) {
                // Tratamento genérico para exceções
                if (e instanceof NumberFormatException) {
                    System.out.println("Ocorreu um erro de formato numérico: " + e.getMessage());
                } else if (e instanceof IllegalArgumentException) {
                    System.out.println("Erro de argumento na busca: " + e.getMessage());
                } else if (e instanceof ErroFormatoDeAnoException) {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                }
            }
        }
        leitura.close(); // Libera recursos ao encerrar o Scanner
    }
}
