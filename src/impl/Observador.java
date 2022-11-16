package impl;
import interfaces.iObservador;

public class Observador implements iObservador {

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel obs) {
        System.out.println("Observador " + id + " foi notificado");
        System.out.println("Contando todas as palavras: " + obs.NumeroDePalavras(obs.getFrase()));
        System.out.println("Contando palavras pares: " + observavel.NumeroPares(obs.getFrase()));
        System.out.println("Contando palavras maiúsculas: " + obs.NumeroPalavrasMaiusculas(obs.getFrase()));

    }
}
