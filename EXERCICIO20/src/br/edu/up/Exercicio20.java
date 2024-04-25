
/*
A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
Professor Nível 1 R$12,00 por hora/aula
Professor Nível 2 R$17,00 por hora/aula
Professor Nível 3 R$25,00 por hora/aula
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        NivelProfessor objNivelProfessor = new NivelProfessor();

        System.out.println("Nível de professor: ");
        objNivelProfessor.setNivel(ler.nextInt());
        ler.nextLine();

        System.out.println("Digite quantas horas deu aula: ");
        objNivelProfessor.setHoras(ler.nextInt());

        System.out.println("-------------------------");
        
        System.out.println("Nivel de professor: " + objNivelProfessor.getNivel());

        System.out.println("Salário horas/aula: " + objNivelProfessor.calculoSalarioProfessor());




        ler.close();
    }
}
