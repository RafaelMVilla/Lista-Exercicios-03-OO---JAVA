package br.edu.up;

public class IntervaloNumeros {
    private int valor;

    public IntervaloNumeros() {}

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean contaVerificar() {
        return getValor() >= 10 && getValor() <= 150;
    }
}