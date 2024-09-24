package Entidades;

import application.Carta;

public class Companhia extends Carta {

    private int multiplicar;
    private int hipoteca;

    public Companhia(String nome, String cor, int multiplicar, int hipoteca) {
        super(nome, cor);
        this.multiplicar = multiplicar;
        this.hipoteca = hipoteca;
    }

    public int getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(int multiplicar) {
        this.multiplicar = multiplicar;
    }

    public int getHipoteca() {
        return hipoteca;
    }

    public void setHipoteca(int hipoteca) {
        this.hipoteca = hipoteca;
    }

    public int calcular(int dado) {
        return dado * multiplicar;
    }

    @Override
    public String mostrar() {
        return "Nome: " + this.getNome() + ", Cor: " + this.getCor() +
                ", Multiplicador: " + this.multiplicar + ", Hipoteca: " + this.hipoteca;
    }
}
