package br.edu.up;

import java.util.Scanner;

public class Exercicio26 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Seguro objSeguro = new Seguro();

        do {
            System.out.println("Digite a idade: ");
            objSeguro.setIdade(leitor.nextInt());

            if (objSeguro.getIdade() < 17 || objSeguro.getIdade() > 70) {
                System.out.println("Esse tipo de informação não se enquadra!");
                break;
            }

            System.out.println("Digite o grupo de risco(em número): ");
            objSeguro.setGrupoRisco(leitor.nextInt());

            if (objSeguro.getGrupoRisco() < 1 || objSeguro.getGrupoRisco() > 9) {
                System.out.println("Esse tipo de informação não se enquadra!");
                break;
            }

            System.out.println("<----------------->");
            System.out.printf("Idade: ");
            System.out.println(objSeguro.verificaIdade());
            System.out.printf("Grupo de risco: ");
            System.out.println(objSeguro.verificaSeguro());
        } while (objSeguro.getIdade() >= 17 && objSeguro.getIdade() <= 70 && objSeguro.getGrupoRisco() >= 1
                && objSeguro.getGrupoRisco() <= 9);

        leitor.close();
    }
}
