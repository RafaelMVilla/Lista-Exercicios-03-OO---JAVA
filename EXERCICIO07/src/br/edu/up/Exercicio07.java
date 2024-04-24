package br.edu.up;

import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Carro objCarro = new Carro();

        System.out.println("Digite o custo de fábrica: ");
        float custoFabrica = leitor.nextFloat();
        objCarro.setCustoFabrica(custoFabrica);

        System.out.println("Preço final: " + objCarro.precoFinal());

        leitor.close();
    }
}
