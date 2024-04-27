package br.edu.up;

public class Empresa {
    private float salarioFunc;
    private float salarioFinal;
    private float reajusteReal;

    public Empresa() {

    }

    public Empresa(float salarioFunc, float salarioFinal, float reajusteReal) {
        this.salarioFunc = salarioFunc;
        this.salarioFinal = salarioFinal;
        this.reajusteReal = reajusteReal;
    }

    public float getSalarioFunc() {
        return salarioFunc;
    }

    public void setSalarioFunc(float salarioFunc) {
        this.salarioFunc = salarioFunc;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public float getReajusteReal() {
        return reajusteReal;
    }

    public void setReajusteReal(float reajusteReal) {
        this.reajusteReal = reajusteReal;
    }

    public float reajuste(float salarioFunc) {
        if (salarioFunc <= 4050) {
            reajusteReal += (salarioFunc / 2);
            salarioFinal = salarioFunc + (salarioFunc / 2);
        } else if (salarioFunc > 4050 && salarioFunc <= 13500) {
            reajusteReal += (salarioFunc / 5);
            salarioFinal = salarioFunc + (salarioFunc / 5);
        } else if (salarioFunc > 13500 && salarioFunc <= 27000) {
            reajusteReal += ((salarioFunc * 15) / 100);
            salarioFinal = salarioFunc + ((salarioFunc * 15) / 100);
        } else if (salarioFunc > 27000) {
            reajusteReal += ((salarioFunc * 10) / 100);
            salarioFinal = salarioFunc + ((salarioFunc * 10) / 100);
        }
        return reajusteReal;
    }
}
