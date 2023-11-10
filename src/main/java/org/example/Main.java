package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> molho = Arrays.asList("Maionese", "Ketchup");
        var pao1 = new PaoBuilder("PAO FRANCES")
                .recheio("Frango")
                .molho(molho)
                .detalheAdicional("bacon")
                .criarPao();

        var pao2 = new PaoBuilder("Pao italiano")
                .recheio("Frango")
                .detalheAdicional("Mostarda").criarPao();

        System.out.println(pao1.toString());
        System.out.println(pao2.toString());
    }
}
