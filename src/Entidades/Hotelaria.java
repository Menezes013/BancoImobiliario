package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Hotelaria {

    private List<Propriedade> propriedades;
    private double valorHipoteca;

    public Hotelaria() {
        this.propriedades = new ArrayList<>();
    }

    public void adicionarPropriedade(Propriedade propriedade) {
        if (propriedade == null) {
            throw new IllegalArgumentException("Propriedade não pode ser nula.");
        }
        propriedades.add(propriedade);
    }

    public Propriedade getPropriedade(String nome) throws PropriedadeException {
        for (Propriedade propriedade : propriedades) {
            if (propriedade.getNome().equalsIgnoreCase(nome)) {
                return propriedade;
            }
        }
        throw new PropriedadeException("Propriedade " + nome + " não encontrada.");
    }

}