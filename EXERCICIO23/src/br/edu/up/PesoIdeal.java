package br.edu.up;

public class PesoIdeal {
    private String nome;
    private String sexo;
    private double altura;
    private int idade;
    private double peso;

    public PesoIdeal(){

    }

    public PesoIdeal(String nome, String sexo, double altura, int idade, double peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    double calculoPesoIdeal() {
        if (sexo.equals("M") && altura > 1.70 && idade <= 20) {
            peso = (72.7 * altura) - 58;
        } else if (sexo.equals("M") && altura > 1.70 && idade < 20 && idade < 40) {
            peso = (72.7 * altura) - 53;
        } else if (sexo.equals("M") && altura > 1.70 && idade >= 40) {
            peso = (72.7 * altura) - 45;
        } else if (sexo.equals("M") && altura <= 1.70 && idade <= 40) {
            peso = (72.7 * altura) - 50;
        } else if (sexo.equals("M") && altura <= 1.70 && idade > 40) {
            peso = (72.7 * altura) - 58;
        } else if (sexo.equals("F") && altura > 1.50 && idade < 35) {
            peso = (62.1 * altura) - 44.7;
        } else if (sexo.equals("F") && altura <= 1.50 && idade >= 35) {
            peso = (62.1 * altura) - 45;
        } else if (sexo.equals("F") && altura <= 1.50 && idade < 35) {
            peso = (62.1 * altura) - 4;
        }
        return peso;
    }
}
