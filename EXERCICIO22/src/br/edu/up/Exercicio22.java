package br.edu.up;

import java.util.Scanner;

public class Exercicio22 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Luz objContaLuz = new Luz();

        System.out.println("Digite o tipo de cliente: ");
        objContaLuz.setTipoCliente(leitor.nextInt());

        System.out.println("Digite a quantidade de horas: ");
        objContaLuz.setKwHora(leitor.nextInt());

        System.out.println("Valor da conta: " + objContaLuz.calculoLuz() + " reais.");

        leitor.close();
    }
}
