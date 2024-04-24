package br.edu.up;

import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Produto objProduto = new Produto();

        System.out.println("Digite o custo do produto: ");
        float precoCusto = leitor.nextFloat();
        objProduto.setPrecoCusto(precoCusto);

        System.out.println("Digite o acréscimo: ");
        float acrescimo = leitor.nextFloat();
        objProduto.setAcrescimo(acrescimo);

        System.out.println("<------------------>");

        System.out.println("Valor de venda: " + objProduto.valorVenda());

        leitor.close();
    }
}
