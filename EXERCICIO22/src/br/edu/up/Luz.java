package br.edu.up;

public class Luz {
    private int tipoCliente;
    private int kwHora;
    private float contaLuz;

    public Luz(){

    }

    public Luz(int tipoCliente, int kwHora, float contaLuz) {
        this.tipoCliente = tipoCliente;
        this.kwHora = kwHora;
        this.contaLuz = contaLuz;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getKwHora() {
        return kwHora;
    }

    public void setKwHora(int kwHora) {
        this.kwHora = kwHora;
    }

    public float getContaLuz() {
        return contaLuz;
    }

    public void setContaLuz(float contaLuz) {
        this.contaLuz = contaLuz;
    }

    float calculoLuz() {
        if (tipoCliente == 1) {
            contaLuz = kwHora * 0.60f;
        } else if(tipoCliente == 2){
            contaLuz = kwHora * 0.48f;
        } else if(tipoCliente == 3){
            contaLuz = kwHora * 1.29f;
        }
        return contaLuz;
    }

}
