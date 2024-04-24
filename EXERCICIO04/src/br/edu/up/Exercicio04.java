
/*
Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        Cotacao objCotacao = new Cotacao();

        System.out.println("Digite a quantidade de reais: ");
        double real = ler.nextDouble();
        objCotacao.setReal(real);

        System.out.println("Digite a cotação: ");
        double cotacao = ler.nextDouble();
        objCotacao.setCotacao(cotacao);

        System.out.println("-----------------------");
        System.out.println("Valor em Reais: " + objCotacao.getReal());
        System.out.println("-----------------------");
        
        System.out.println("Valor em Dólares: " + objCotacao.dolar());

        ler.close();
    }
}
