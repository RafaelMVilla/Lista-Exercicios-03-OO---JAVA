package br.edu.up;

public class Carango {
    
    private double valorCarro;
    private double desconto;
    private double descontoAlcool;
    private double descontoGasolina;
    private double descontoDiesel;
    private double descontoParcial;
    private int tipo;

    public Carango(){

    }

    public Carango(double valorCarro, int tipo){

        this.valorCarro = valorCarro;
        this.tipo = tipo;

    }


    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDescontoAlcool() {
        return descontoAlcool;
    }

    public void setDescontoAlcool(double descontoAlcool) {
        this.descontoAlcool = descontoAlcool;
    }

    public double getDescontoGasolina() {
        return descontoGasolina;
    }

    public void setDescontoGasolina(double descontoGasolina) {
        this.descontoGasolina = descontoGasolina;
    }

    public double getDescontoDiesel() {
        return descontoDiesel;
    }

    public void setDescontoDiesel(double descontoDiesel) {
        this.descontoDiesel = descontoDiesel;
    }

    public double getDescontoParcial() {
        return descontoParcial;
    }

    public void setDescontoParcial(double descontoParcial) {
        this.descontoParcial = descontoParcial;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularDesconto(){

        if (tipo == 1) {
            desconto = valorCarro * 0.25;

        }else if (tipo == 2) {
            desconto = valorCarro * 0.21;
            
        }else {
            desconto = valorCarro * 0.14;

        }
            
            return desconto;
          
    }

    // public double calcularDescontoParcial(){
    //     if (tipo == 1) {
    //         descontoParcial = 0.25;
            
    //     }else if (tipo == 2) {
    //         descontoParcial = 0.21;
            
    //     }else {
    //         descontoParcial = 0.14;
    //     }

    //         return descontoParcial;
    // }
}
