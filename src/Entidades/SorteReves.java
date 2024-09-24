package Entidades;

import application.Carta;

public class SorteReves extends Carta {

    private Boolean sorte;
    private int valor;

    public SorteReves(String nome, String cor, Boolean sorte, int valor) {
        super(nome, cor);
        this.sorte = sorte;
        this.valor = valor;
    }

    public Boolean getSorte() {
        return sorte;
    }

    public void setSorte(Boolean sorte) {
        this.sorte = sorte;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String mostrar() {

        String resultado = "Carta: " + getNome() + ", Cor: " + getCor();
        if (sorte) {
            resultado += " - Sorte! Você recebe: R$ " + valor;
        } else {
            resultado += " - Revés! Você deve pagar: R$ " + valor;
        }
        return resultado;
    }
}
