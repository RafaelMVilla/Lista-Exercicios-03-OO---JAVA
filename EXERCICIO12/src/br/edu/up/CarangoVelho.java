package br.edu.up;

public class CarangoVelho {
    private int qtdCarro;
    private float valorDesconto;
    private float valorCarro = 0;
    private float valorFinal = 0;
    private int anoVeic;
    private String opcao = "";
    private int cont2000 = 0;
    private int totalCarro = 0;

    public CarangoVelho(){

    }

    public CarangoVelho(int qtdCarro, float valorDesconto, float valorCarro, float valorFinal, int anoVeic,
            String opcao, int cont2000, int totalCarro) {
        this.qtdCarro = qtdCarro;
        this.valorDesconto = valorDesconto;
        this.valorCarro = valorCarro;
        this.valorFinal = valorFinal;
        this.anoVeic = anoVeic;
        this.opcao = opcao;
        this.cont2000 = cont2000;
        this.totalCarro = totalCarro;
    }

    public int getQtdCarro() {
        return qtdCarro;
    }

    public void setQtdCarro(int qtdCarro) {
        this.qtdCarro = qtdCarro;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(float valorCarro) {
        this.valorCarro = valorCarro;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getAnoVeic() {
        return anoVeic;
    }

    public void setAnoVeic(int anoVeic) {
        this.anoVeic = anoVeic;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public int getCont2000() {
        return cont2000;
    }

    public void setCont2000(int cont2000) {
        this.cont2000 = cont2000;
    }

    public int getTotalCarro() {
        return totalCarro;
    }

    public void setTotalCarro(int totalCarro) {
        this.totalCarro = totalCarro;
    }

    float desconto() {
        if (anoVeic > 2000) {
            valorCarro = valorDesconto * 0.07f;
            valorFinal = valorDesconto - valorCarro;
        } else if (anoVeic <= 2000) {
            valorCarro = valorDesconto * 0.12f;
            valorFinal = valorDesconto - valorCarro;
            cont2000 += 1;
        }
        totalCarro += 1;
        return valorCarro;
    }

}
