
/*
A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes.
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de clientes: ");
        int qtdeClientes = ler.nextInt();

        double descontoTotal = 0;
        int valorPagoTotal = 0;
        
        
        for (int i = 0; i < qtdeClientes; i++) {
            
            Carango objCarango = new Carango();
            
            System.out.println("Digite o valor do carro: ");
            objCarango.setValorCarro(ler.nextDouble());
            
            if (objCarango.getValorCarro() == 0) {
                System.exit(0);
            }
            
            System.out.println("Digite o tipo do seu carro: ");
            System.out.println("Digite (1) se for Alcool:  ");
            System.out.println("Digite (2) se for Gasolina: ");
            System.out.println("Digite (3) se for Diesel: ");
            
            objCarango.setTipo(ler.nextInt());
            
            // descontoTotal = descontoTotal + (objCarango.calcularDescontoParcial() * 100);
            descontoTotal += objCarango.calcularDesconto();

            valorPagoTotal += objCarango.getValorCarro();
            
            System.out.println("------------------------");
        }    

        System.out.println("Total de desconto: R$" + descontoTotal);
        System.out.println("Total pago: R$" + valorPagoTotal);

        ler.close();
    }
}
