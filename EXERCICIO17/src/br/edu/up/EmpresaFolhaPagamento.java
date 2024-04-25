package br.edu.up;

public class EmpresaFolhaPagamento {
    
    private String nome;
    private double salarioFuncionario;
    private double salarioMinimo;
    private double percReajuste;
    private double salarioReajustado;

    public EmpresaFolhaPagamento(){

    }

    public EmpresaFolhaPagamento(String nome, double salarioFuncionario, double salarioMinimo, double percReajuste){

        this.nome = nome;
        this.salarioFuncionario = salarioFuncionario;
        this.salarioMinimo = salarioMinimo;
        this.percReajuste = percReajuste;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getPercReajuste() {
        return percReajuste;
    }

    public void setPercReajuste(double percReajuste) {
        this.percReajuste = percReajuste;
    }

    public double getSalarioReajustado() {
        return salarioReajustado;
    }

    public void setSalarioReajustado(double salarioReajustado) {
        this.salarioReajustado = salarioReajustado;
    }

    public double calcularReajuste() {
        double salarioReajustado = salarioFuncionario * (1 + percReajuste / 100);
        return salarioReajustado;
    }

    public double calcularAumentoFolha() {
        return calcularReajuste() - salarioFuncionario;
    }
}
