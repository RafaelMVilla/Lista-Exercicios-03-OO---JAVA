
/*
Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio08 {

    public static void executar(){

        Scanner ler = new Scanner(System.in);
        NotasAluno objAluno = new NotasAluno();
        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        objAluno.setNome(nome);

        
        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();
        objAluno.setNota1(nota1);
        
        System.out.println("Digite sua segunda nota: ");
        double nota2 = ler.nextDouble();
        objAluno.setNota2(nota2);
        
        System.out.println("Digite sua terceira nota: ");
        double nota3 = ler.nextDouble();
        objAluno.setNota3(nota3);
        

        System.out.println("--------------------");
        System.out.println("Nome: " + objAluno.getNome());

        if (objAluno.calculoNotas() >= 7) {
            System.out.println("Média: " + objAluno.calculoNotas() + " , Aprovado :)");
        } else if (objAluno.calculoNotas() > 5.1 && objAluno.calculoNotas() < 6.9) {
            System.out.println("Média: " + objAluno.calculoNotas() + " , Recuperação :|");
        } else {
            System.out.println("Média: " + objAluno.calculoNotas() + " , Reprovado :(");
        }


        ler.close();
    }
}
