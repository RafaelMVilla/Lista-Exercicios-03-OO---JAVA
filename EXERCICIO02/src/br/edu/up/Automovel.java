package br.edu.up;

public class Automovel {
    
    private double distancia;
    private double combGasto;

    
    public Automovel(){
        
    }

    public Automovel(double distancia, double combGasto) {
        this.distancia = distancia;
        this.combGasto = combGasto;
    }



    public double getDistancia() {
        return distancia;
    }




    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }




    public double getCombGasto() {
        return combGasto;
    }




    public void setCombGasto(double combGasto) {
        this.combGasto = combGasto;
    }




    public double resultado(){
        return (this.distancia / this.combGasto);
    }
}

