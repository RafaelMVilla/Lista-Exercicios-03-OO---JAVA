package br.edu.up;

public class Pessoa {

    private int idade;

    public Pessoa() {

    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isMaiorDeIdade() {
        if (idade > 17) {
            return true;
        }
        return false;
    }
}
