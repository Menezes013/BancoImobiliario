package application;

public abstract class Carta {

    private String nome;
    private String cor;

    public Carta(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String mostrar(){
        return "Nome: " + this.nome + "\ncor: " + this.cor;

    }

}
