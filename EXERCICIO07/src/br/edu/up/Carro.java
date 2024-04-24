package br.edu.up;

public class Carro {
    private float custoFabrica;
    private float distribuidor = 28;
    private float impostos = 45;

    public Carro(){

    }

    public Carro(float custoFabrica, float distribuidor, float impostos) {
        this.custoFabrica = custoFabrica;
        this.distribuidor = distribuidor;
        this.impostos = impostos;
    }

    public float getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(float custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public float getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(float distribuidor) {
        this.distribuidor = distribuidor;
    }

    public float getImpostos() {
        return impostos;
    }

    public void setImpostos(float impostos) {
        this.impostos = impostos;
    }

    public float precoFinal(){
        return custoFabrica + (custoFabrica / impostos) + (custoFabrica / distribuidor);
    }
}
