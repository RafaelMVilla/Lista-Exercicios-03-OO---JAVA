package br.edu.up;

public class VendaProdutos {
    
    private double precoCusto;
    private double precoVenda;
    private int mediaProdutos;
    private int mediaTotal;

    public VendaProdutos(){

    }

    public VendaProdutos(double precoCusto, double precoVenda){

        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }
    

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getMediaProdutos() {
        return mediaProdutos;
    }

    public void setMediaProdutos(int mediaProdutos) {
        this.mediaProdutos = mediaProdutos;
    }

    public int getMediaTotal() {
        return mediaTotal;
    }

    public void setMediaTotal(int mediaTotal) {
        this.mediaTotal = mediaTotal;
    }

    public int calcularVenda(){

        if (precoCusto < precoVenda) {
            
            return 1;
        } else if (precoCusto == precoVenda) {
            return 0;
        } else {
            return -1;
        }
    }
}
