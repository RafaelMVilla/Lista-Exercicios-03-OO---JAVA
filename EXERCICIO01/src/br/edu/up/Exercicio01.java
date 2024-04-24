package br.edu.up;

import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Aluno objAluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        objAluno.setNome(nome);

        System.out.println("Digite a nota 1 do aluno: ");
        float nota1 = leitor.nextFloat();
        objAluno.setNota1(nota1);

        System.out.println("Digite a nota 2 do aluno: ");
        float nota2 = leitor.nextFloat();
        objAluno.setNota2(nota2);

        System.out.println("Digite a nota 3 do aluno: ");
        float nota3 = leitor.nextFloat();
        objAluno.setNota3(nota3);

        float res = Aluno.media(nota1, nota2, nota3);

        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Nota 1: " + objAluno.getNota1());
        System.out.println("Nota 2: " + objAluno.getNota2());
        System.out.println("Nota 3: " + objAluno.getNota3());
        System.out.println("Média: " + res);

        leitor.close();

    }
}
