package br.edu.up;

public class Prestacoes {
    private float valorCompra;
    private float opcao;

    public Prestacoes(){

    }

    public Prestacoes(float valorCompra, float opcao) {
        this.valorCompra = valorCompra;
        this.opcao = opcao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getOpcao() {
        return opcao;
    }

    public void setOpcao(float opcao) {
        this.opcao = opcao;
    }

    public float valorPrestacao(){
        return valorCompra / opcao;
    }
}
