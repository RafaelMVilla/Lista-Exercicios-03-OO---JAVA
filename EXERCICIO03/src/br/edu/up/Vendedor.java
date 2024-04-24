package br.edu.up;

public class Vendedor{

    private String nome;
    private float salarioFixo;
    private float totalVendas;

    public Vendedor(){

    }

    public Vendedor(String nome, float salarioFixo, float totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float salarioFinal(){
        return (this.totalVendas / 15) + this.salarioFixo;
    }

}