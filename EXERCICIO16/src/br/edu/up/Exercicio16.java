package br.edu.up;

import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        float salario = 0;

        for (int i = 0; i < 2; i++) {
            Empresa objFuncionario = new Empresa();
            System.out.println("Digite o salário do funcionário: ");
            salario = leitor.nextFloat();
            objFuncionario.setSalarioFunc(salario);
            System.out.println("Reajuste: + " + objFuncionario.reajuste(salario));
            System.out.println("Salário reajustado: " + objFuncionario.getSalarioFinal());
            System.out.println("<----------->");
        }

        leitor.close();
    }
}
