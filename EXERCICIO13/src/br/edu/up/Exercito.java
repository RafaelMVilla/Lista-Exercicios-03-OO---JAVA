package br.edu.up;

public class Exercito {
    
    private String nome;
    private int idade;
    private int qtdePessoas;
    private char saude;
    private int verificador;

    public Exercito(){

    }

    public Exercito(String nome, int idade, char saude){

        this.nome = nome;
        this.idade = idade;
        this.saude = saude;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public char getSaude() {
        return saude;
    }

    public void setSaude(char saude) {
        this.saude = saude;
    }

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }

    public int verificarSaude(){

        if (saude == 'S' || saude == 's') {
            verificador = 1;

        } else if (saude == 'N' || saude == 'n') {
            verificador = 0;

        }
        return verificador;
    }
}
