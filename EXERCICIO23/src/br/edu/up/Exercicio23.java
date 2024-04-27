package br.edu.up;

import java.util.Scanner;

public class Exercicio23 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        PesoIdeal objPesoIdeal = new PesoIdeal();

        System.out.println("Digite o nome: ");
        objPesoIdeal.setNome(leitor.nextLine());

        System.out.println("Digite o sexo: ");
        objPesoIdeal.setSexo(leitor.nextLine());

        System.out.println("Digite a altura: ");
        objPesoIdeal.setAltura(leitor.nextDouble());

        System.out.println("Digite a idade: ");
        objPesoIdeal.setIdade(leitor.nextInt());

        System.out.println("<------------>");
        System.out.println("Nome: " + objPesoIdeal.getNome());
        System.out.println("Sexo: " + objPesoIdeal.getSexo());
        System.out.println("Altura: " + objPesoIdeal.getAltura());
        System.out.println("Idade: " + objPesoIdeal.getIdade());
        System.out.println("Peso ideal: " + objPesoIdeal.calculoPesoIdeal());

        leitor.close();
    }
}
