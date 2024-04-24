package br.edu.up;

public class Cotacao {
    
    private double real;
    private double cotacao;

    public Cotacao(){

    }

    public Cotacao(double real, double cotacao) {
        this.real = real;
        this.cotacao = cotacao;
    }


    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double dolar(){
        return (real / cotacao);
    }
}
