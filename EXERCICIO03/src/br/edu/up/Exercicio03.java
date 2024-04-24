package br.edu.up;

import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Vendedor objVendedor = new Vendedor();

        System.out.printf("Digite o nome do vendedor: ");
        String nome = leitor.nextLine();
        objVendedor.setNome(nome);

        System.out.printf("Digite o salário fixo do vendedor: ");
        float salarioFixo = leitor.nextFloat();
        objVendedor.setSalarioFixo(salarioFixo);

        System.out.printf("Digite o total em vendas efetuadas por ele: ");
        float totalVendas = leitor.nextFloat();
        objVendedor.setTotalVendas(totalVendas);

        System.out.println("<-------------->");
        System.out.println("Nome vendedor: " + objVendedor.getNome());
        System.out.println("Salário fixo: " + objVendedor.getSalarioFixo());
        System.out.println("Salário final do mês: " + objVendedor.salarioFinal());

        leitor.close();

    }
}
