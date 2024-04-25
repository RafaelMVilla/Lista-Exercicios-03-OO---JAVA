
/*
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento.
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio17 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        EmpresaFolhaPagamento empresaFolhaPagamento = new EmpresaFolhaPagamento();

        System.out.println("Digite o nome do funcionário: ");
        empresaFolhaPagamento.setNome(ler.nextLine());

        System.out.println("Digite o seu salário: ");
        empresaFolhaPagamento.setSalarioFuncionario(ler.nextDouble());

        System.out.println("Digite o salário mínimo: ");
        empresaFolhaPagamento.setSalarioMinimo(ler.nextDouble());

        System.out.println("Digite a percentagem de reajuste desejada: ");
        empresaFolhaPagamento.setPercReajuste(ler.nextDouble());

        System.out.println("----------------------------");

        System.out.println("Nome: " + empresaFolhaPagamento.getNome());

        System.out.println("Salário mínimo: " + empresaFolhaPagamento.getSalarioMinimo());

        System.out.println("Salário anterior ao reajuste: " + empresaFolhaPagamento.getSalarioFuncionario());

        System.out.println("Salário após o reajuste: " + empresaFolhaPagamento.calcularReajuste());

        

        ler.close();
    }
}
