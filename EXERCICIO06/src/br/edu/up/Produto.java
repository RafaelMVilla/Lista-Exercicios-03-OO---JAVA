package br.edu.up;

public class Produto {
    private float precoCusto;
    private float acrescimo;

    public Produto() {

    }

    public Produto(float precoCusto, float acrescimo) {
        this.precoCusto = precoCusto;
        this.acrescimo = acrescimo;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }

    public float valorVenda() {
        return precoCusto * (1 + (acrescimo / 100));
    }
}
