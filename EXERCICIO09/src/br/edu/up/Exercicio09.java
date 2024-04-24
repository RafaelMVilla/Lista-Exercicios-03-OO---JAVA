
/*
Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive).
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        IntervaloNumeros[] objIntervaloNumeros = new IntervaloNumeros[80];

        for (int i = 0; i < 80; i++) {
            System.out.println("Digite o "+ (i + 1) + "º número: ");
            int valor = ler.nextInt();
            objIntervaloNumeros[i] = new IntervaloNumeros();  // Inicialize o objeto
            objIntervaloNumeros[i].setValor(valor);
        }

        int total = 0;
        for (int i = 0; i < 80; i++) {
            if (objIntervaloNumeros[i].contaVerificar()) {
                total++;
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Você digitou " + total + " número(s) dentro do intervalo de (10 - 150).");
        ler.close();
    }
}