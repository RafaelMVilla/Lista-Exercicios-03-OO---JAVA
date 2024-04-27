package br.edu.up;

import java.util.Scanner;

public class Exercicio21 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        CategoriaNadador objNadador = new CategoriaNadador();

        System.out.println("Digite a idade de um nadador: ");
        objNadador.setIdade(leitor.nextInt());

        System.out.println(objNadador.verificaIdade());

        leitor.close();
    }
}
