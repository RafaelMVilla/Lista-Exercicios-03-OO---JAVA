package br.edu.up;

public class FuncionarioAbono {
    
    private String nome;
    private int idade;
    private char sexo;
    private double salario;
    private double salarioFinal;

    public FuncionarioAbono(){

    }

    public FuncionarioAbono(String nome, int idade, char sexo, double salario){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public int verificarSexo(){

        if (sexo == 'M' || sexo == 'm') {
            return 0;
        } else if (sexo == 'F' || sexo == 'f') {
            return 1;
        }
            return -1;
    }

    public double verificarSalarioSexoMasc(){

        if (verificarSexo() == 0 && idade >= 30) {
            
            salarioFinal = salario + 100;

        }else if (verificarSexo() == 0 && idade < 30) {
            
            salarioFinal = salario + 50;
        }
        return salarioFinal;
    }

    public double verificarSalarioSexoFem(){

        if (verificarSexo() == 1 && idade >= 30) {
            
            salarioFinal = salario + 200;

        }else if (verificarSexo() == 1 && idade < 30) {
            
            salarioFinal = salario + 80;
        }
        return salarioFinal;
    }

}
