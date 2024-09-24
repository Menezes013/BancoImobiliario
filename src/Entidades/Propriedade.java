package Entidades;

import application.Carta;

public class Propriedade extends Carta implements Transcionavel {

    private int aluguel;
    private int casas;
    private int hipoteca;

    public Propriedade(String nome, String cor, String aluguel, String casas, String hipoteca) {
        super(nome, cor);
        this.aluguel = Integer.parseInt(aluguel);
        this.casas = Integer.parseInt(casas);
        this.hipoteca = Integer.parseInt(hipoteca);
    }

    public void calcularAluguel(){
        int i = this.casas * this.aluguel;
    }

    @Override
    public String mostrar() {
        String s = "Nome: " + getNome() +
                ", Cor: " + getCor() +
                ", Aluguel: " + aluguel +
                ", Quantidade de Casas: " + casas +
                ", Valor da Hipoteca: " + hipoteca;
        return s;
    }

    @Override
    public String toString() {
        return "Propriedade{" +
                "nome=" + getNome() +
                ", cor=" + getCor() +
                ", aluguel=" + aluguel +
                ", casas=" + casas +
                ", hipoteca=" + hipoteca +
                '}';
    }

    @Override
    public String comprar() {
        return "Comprado por " + this.hipoteca;
    }

    @Override
    public String vender() {
        return "Vendido por " + this.hipoteca;
    }
}
