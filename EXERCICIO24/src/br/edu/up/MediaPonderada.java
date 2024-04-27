package br.edu.up;

public class MediaPonderada {
    private float notaLab;
    private float notaAval;
    private float notaExam;
    private float notaFinal;

    public MediaPonderada(){

    }

    public MediaPonderada(float notaLab, float notaAval, float notaExam, float notaFinal) {
        this.notaLab = notaLab;
        this.notaAval = notaAval;
        this.notaExam = notaExam;
        this.notaFinal = notaFinal;
    }

    public float getNotaLab() {
        return notaLab;
    }

    public void setNotaLab(float notaLab) {
        this.notaLab = notaLab;
    }

    public float getNotaAval() {
        return notaAval;
    }

    public void setNotaAval(float notaAval) {
        this.notaAval = notaAval;
    }

    public float getNotaExam() {
        return notaExam;
    }

    public void setNotaExam(float notaExam) {
        this.notaExam = notaExam;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    float calculoMediaPond() {
        notaFinal = ((notaLab * 2) + (notaAval * 3) + (notaExam * 5)) / (2 + 3 + 5);
        return notaFinal;
    }
}
