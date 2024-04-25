
/*
Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade:
Sexo     Idade     Abono
  M      >= 30     100,00
          < 30      50,00
  F      >= 30     200,00
          < 30      80,00
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio18 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        FuncionarioAbono objFuncionarioAbono = new FuncionarioAbono();

        
        System.out.println("Digite seu nome: ");
        objFuncionarioAbono.setNome(ler.nextLine());;
        
        System.out.println("Digite sua idade: ");
        objFuncionarioAbono.setIdade(ler.nextInt());
        ler.nextLine();
        
        System.out.println("Digite seu sexo (M / F): ");
        objFuncionarioAbono.setSexo(ler.nextLine().charAt(0));
        
        System.out.println("Digite seu salario: ");
        objFuncionarioAbono.setSalario(ler.nextDouble());
        

        System.out.println("-------------------------------");

        System.out.println("Nome: " + objFuncionarioAbono.getNome());

        System.out.println("Idade: " + objFuncionarioAbono.getIdade());

        System.out.println("Sexo: " + objFuncionarioAbono.getSexo());

        System.out.println("Salário antes do abono: " + objFuncionarioAbono.getSalario());

        if (objFuncionarioAbono.verificarSexo() == 0) {
            
            System.out.println("Salário após abono: " + objFuncionarioAbono.verificarSalarioSexoMasc());

        }else if (objFuncionarioAbono.verificarSexo() == 1) {
            System.out.println("Salário após abono: " + objFuncionarioAbono.verificarSalarioSexoFem());
        }



        ler.close();
    }
}
