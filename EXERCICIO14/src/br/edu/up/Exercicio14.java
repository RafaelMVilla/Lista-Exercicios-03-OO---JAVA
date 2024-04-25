
/*
Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de custo e do preço de venda.
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        VendaProdutos[] objVendaProdutos = new VendaProdutos[40];

        double totalCusto = 0;
        double totalVenda = 0;

        for (int i = 0; i < 40; i++) {

            VendaProdutos produtos = new VendaProdutos();
            
            System.out.println("Digite o preço de custo do produto: ");
            produtos.setPrecoCusto(ler.nextDouble());
            ler.nextLine();
            
            System.out.println("Digite o preço de venda: ");
            produtos.setPrecoVenda(ler.nextDouble());
            ler.nextLine();

            totalCusto += produtos.getPrecoCusto();
            totalVenda += produtos.getPrecoVenda();

            System.out.println("------------------------");

            objVendaProdutos[i] = produtos;

        }

        for (int i = 0; i < 40; i++) {

            
            if (objVendaProdutos[i].calcularVenda() == 1) {
                
                System.out.println("O " + (i + 1) + " produto teve um custo: " + objVendaProdutos[i].getPrecoCusto());
                System.out.println("O " + (i + 1) + " produto teve um preço de venda: " + objVendaProdutos[i].getPrecoVenda());
                System.out.println("O seu " + (i + 1) + " produto obteve lucro!");

                System.out.println("------------------------");
                
            } else if (objVendaProdutos[i].calcularVenda() == 0) {
                System.out.println("O " + (i + 1) + " produto teve um custo: " + objVendaProdutos[i].getPrecoCusto());
                System.out.println("O " + (i + 1) + " produto teve um preço de venda: " + objVendaProdutos[i].getPrecoVenda());
                System.out.println("O seu " + (i + 1) + " produto obteve empate!");

                System.out.println("------------------------");
                
            }else if (objVendaProdutos[i].calcularVenda() == -1) {
                System.out.println("O " + (i + 1) + " produto teve um custo: " + objVendaProdutos[i].getPrecoCusto());
                System.out.println("O " + (i + 1) + " produto teve um preço de venda: " + objVendaProdutos[i].getPrecoVenda());
                System.out.println("O seu " + (i + 1) + " produto obteve prejuízo!");

                System.out.println("------------------------");
                
            }
        }

        System.out.println("Média de preço de custo: " + (totalCusto / 40));
        System.out.println("Média de preço de venda: " + (totalVenda / 40));

        ler.close();
    }
}
