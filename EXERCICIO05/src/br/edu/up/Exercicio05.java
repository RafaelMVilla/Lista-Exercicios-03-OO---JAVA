package br.edu.up;

import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Prestacoes objPrestacoes = new Prestacoes();

        System.out.printf("Digite o valor da compra: ");
        float valorCompra = leitor.nextFloat();
        objPrestacoes.setValorCompra(valorCompra);

        System.out.println("1x: " + objPrestacoes.getValorCompra() / 1);
        System.out.println("2x: " + objPrestacoes.getValorCompra() / 2);
        System.out.println("3x: " + objPrestacoes.getValorCompra() / 3);
        System.out.println("4x: " + objPrestacoes.getValorCompra() / 4);
        System.out.println("5x: " + objPrestacoes.getValorCompra() / 5);

        System.out.printf("Digite em quantas prestações: ");
        float opcao = leitor.nextFloat();
        objPrestacoes.setOpcao(opcao);

        System.out.println("<-------------->");
        System.out.println("Valor total: " + objPrestacoes.valorPrestacao());

        leitor.close();
    }
}
