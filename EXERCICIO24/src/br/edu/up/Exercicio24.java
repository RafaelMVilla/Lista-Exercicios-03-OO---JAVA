package br.edu.up;

import java.util.Scanner;

public class Exercicio24 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        MediaPonderada objMediaPonderada = new MediaPonderada();

        System.out.println("Digite a nota do exame do laboratório (1 até 10): ");
        objMediaPonderada.setNotaLab(leitor.nextFloat());

        System.out.println("Digite a nota da avaliação semestral (1 até 10): ");
        objMediaPonderada.setNotaAval(leitor.nextFloat());

        System.out.println("Digite a nota do exame final (1 até 10): ");
        objMediaPonderada.setNotaExam(leitor.nextFloat());

        System.out.println("Nota final: " + objMediaPonderada.calculoMediaPond());

        leitor.close();
    }
}
