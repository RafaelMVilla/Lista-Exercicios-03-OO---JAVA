package br.edu.up;

public class Seguro {
    private int idade;
    private int grupoRisco;
    private String tipoRisco = "";
    private String idadeVerificada = "";

    public Seguro(){

    }

    public Seguro(int idade, int grupoRisco, String tipoRisco, String idadeVerificada) {
        this.idade = idade;
        this.grupoRisco = grupoRisco;
        this.tipoRisco = tipoRisco;
        this.idadeVerificada = idadeVerificada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(int grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public String getTipoRisco() {
        return tipoRisco;
    }

    public void setTipoRisco(String tipoRisco) {
        this.tipoRisco = tipoRisco;
    }

    public String getIdadeVerificada() {
        return idadeVerificada;
    }

    public void setIdadeVerificada(String idadeVerificada) {
        this.idadeVerificada = idadeVerificada;
    }

    String verificaIdade() {
        if (idade >= 17 && idade <= 20) {
            idadeVerificada = "17 a 20";
        } else if (idade >= 21 && idade <= 24) {
            idadeVerificada = "21 a 24";
        } else if (idade >= 25 && idade <= 34) {
            idadeVerificada = "25 a 34";
        } else if (idade >= 35 && idade <= 64) {
            idadeVerificada = "35 a 64";
        } else if (idade >= 65 && idade <= 70) {
            idadeVerificada = "65 a 70";
        }
        return idadeVerificada;
    }

    String verificaSeguro() {
        if (idade >= 17 && idade <= 20 && grupoRisco == 1) {
            tipoRisco = "Baixo";
        } else if (idade >= 17 && idade <= 20 && grupoRisco == 2) {
            tipoRisco = "Médio";
        } else if (idade >= 17 && idade <= 20 && grupoRisco == 3) {
            tipoRisco = "Alto";
        } else if (idade >= 21 && idade <= 24 && grupoRisco == 2) {
            tipoRisco = "Baixo";
        } else if (idade >= 21 && idade <= 24 && grupoRisco == 3) {
            tipoRisco = "Médio";
        } else if (idade >= 21 && idade <= 24 && grupoRisco == 4) {
            tipoRisco = "Alto";
        } else if (idade >= 25 && idade <= 34 && grupoRisco == 3) {
            tipoRisco = "Baixo";
        } else if (idade >= 25 && idade <= 34 && grupoRisco == 4) {
            tipoRisco = "Médio";
        } else if (idade >= 25 && idade <= 34 && grupoRisco == 5) {
            tipoRisco = "Alto";
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 4) {
            tipoRisco = "Baixo";
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 5) {
            tipoRisco = "Médio";
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 6) {
            tipoRisco = "Alto";
        } else if (idade >= 65 && idade <= 70 && grupoRisco == 7) {
            tipoRisco = "Baixo";
        } else if (idade >= 65 && idade <= 70 && grupoRisco == 8) {
            tipoRisco = "Médio";
        } else if (idade >= 65 && idade <= 70 && grupoRisco == 9) {
            tipoRisco = "Alto";
        }
        return tipoRisco;
    }
}
