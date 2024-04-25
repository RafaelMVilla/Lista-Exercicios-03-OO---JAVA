package br.edu.up;

import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        CarangoVelho objCarangoVelho = new CarangoVelho();

        do {
            System.out.println("Digite o ano do carro: ");
            objCarangoVelho.setAnoVeic(leitor.nextInt());
            System.out.println("Digite o valor do carro: ");
            objCarangoVelho.setValorDesconto(leitor.nextFloat());
            objCarangoVelho.desconto();
            System.out.println("Valor desconto: " + objCarangoVelho.getValorCarro());
            System.out.println("Valor total: " + objCarangoVelho.getValorFinal());
            leitor.nextLine();
            System.out.println("Deseja continuar (S) ou (N): ");
            objCarangoVelho.setOpcao(leitor.nextLine());
        } while (objCarangoVelho.getOpcao().equals("S"));
        System.out.println("Total carros: " + objCarangoVelho.getTotalCarro());
        System.out.println("Total carros até 2000: " + objCarangoVelho.getCont2000());

        leitor.close();
    }
}
