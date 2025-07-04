package br.com.alura.screenmatch2.principal;

import br.com.alura.screenmatch2.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    Scanner leitura = new Scanner(System.in);

    private ConsumoApi consumoApi = new ConsumoApi();
    private final String ENDERECO = "https://www.omdbapi.com/?t";
    private final String CHAVEAPI = System.getenv("API_KEY_OMDB");

    //;
    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&apikey=" + CHAVEAPI);

    }
}
