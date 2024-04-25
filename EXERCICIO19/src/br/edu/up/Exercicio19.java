
/*
Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é também isóscele;
Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.
 */

package br.edu.up;

import java.util.Scanner;

public class Exercicio19 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        Triangulos objTriangulos = new Triangulos();

        System.out.println("Digite o primeiro lado do triângulo: ");
        objTriangulos.setLado1(ler.nextDouble());

        System.out.println("Digite o primeiro lado do triângulo: ");
        objTriangulos.setLado2(ler.nextDouble());


        System.out.println("Digite o primeiro lado do triângulo: ");
        objTriangulos.setLado3(ler.nextDouble());


        if (objTriangulos.verificarTriangulo() == 1 ) {
            System.out.println("1º Lado: " + objTriangulos.getLado1());
            System.out.println("2º Lado: " + objTriangulos.getLado2());
            System.out.println("3º Lado: " + objTriangulos.getLado3());
            System.out.println("O seu triâgulo é isóceles.");


        }else if (objTriangulos.verificarTriangulo() == 0) {
            System.out.println("1º Lado: " + objTriangulos.getLado1());
            System.out.println("2º Lado: " + objTriangulos.getLado2());
            System.out.println("3º Lado: " + objTriangulos.getLado3());
            System.out.println("O seu triâgulo é equilátero e isóceles.");
            
        }else if (objTriangulos.verificarTriangulo() == -1) {
            System.out.println("1º Lado: " + objTriangulos.getLado1());
            System.out.println("2º Lado: " + objTriangulos.getLado2());
            System.out.println("3º Lado: " + objTriangulos.getLado3());
            System.out.println("O seu triâgulo é escaleno.");
            
        }

        ler.close();
    }
}
