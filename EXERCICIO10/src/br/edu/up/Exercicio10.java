package br.edu.up;

import java.util.Scanner;

public class Exercicio10 {

    public static void executarNovo() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int qtdPessoas = leitor.nextInt();

        Pessoa[] pessoas = new Pessoa[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            Pessoa p = new Pessoa();
            // pessoas[i] = new Pessoa();
            System.out.println("Digite a idade: ");
            // idade = leitor.nextInt();
            p.setIdade(leitor.nextInt());
            // pessoas[i].setIdade(idade);
            pessoas[i] = p;
        }

        for (int cont = 0; cont < qtdPessoas; cont++) {
            if (pessoas[cont].isMaiorDeIdade()) {
                // int ida = p.getIdade();
                System.out.println("Idade: " + pessoas[cont].getIdade() + " | " + "Maior de idade!");
            } else {
                System.out.println("Idade: " + pessoas[cont].getIdade() + " | " + "Menor de idade!");
            }
        }

        leitor.close();

    }

}
