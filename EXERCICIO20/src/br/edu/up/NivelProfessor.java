package br.edu.up;

public class NivelProfessor {
    
    private int horas;
    private int nivel;
    private double salario;

    public NivelProfessor(){

    }

    public NivelProfessor(int nivel, int horas){

        this.nivel = nivel;
        this.horas = horas;
    }
    

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoSalarioProfessor(){

        if (nivel == 1) {
            
            salario = horas * 12;
        } else if (nivel == 2) {
            
            salario = horas * 17;
        } else {
            
            salario = horas * 25;
        }
        return salario;
    }
}
