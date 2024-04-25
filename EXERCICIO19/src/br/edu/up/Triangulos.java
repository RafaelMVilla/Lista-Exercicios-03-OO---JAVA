package br.edu.up;

public class Triangulos {
    
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulos(){

    }

    public Triangulos(double lado1, double lado2, double lado3){

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public int verificarTriangulo(){

        if ((lado1 == lado2 && lado2 != lado3 ) || (lado2 == lado3 && lado3 != lado1) || (lado3 == lado1 && lado1 != lado2)) {
            
            return 1;

        } else if (lado1 == lado2 && lado2 == lado3) {
            
            return 0;

        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            
            return -1;
        }
            return 2;
    }
}
