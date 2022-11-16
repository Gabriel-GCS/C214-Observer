package impl;
import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    private String frase;
    private List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removeObservador(Observador observador) {
        if(observadores.contains(observador)) {
            observadores.remove(observador);
        }
    }

    @Override
    public void notificaObservadores() {
        for(Observador observador : observadores) {
            observador.update(this);
        }
    }

    public int NumeroDePalavras(String frase) {
        this.frase = frase;
        frase.split(" ");
        return palavras.length;
    }

    public int NumeroPares(String frase) {
        this.frase = frase;
        int aux = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.length() % 2 == 0) {
                aux++;
            }
        }
        return contador;
    }

    public int NumeroPalavrasMaiusculas(String frase) {
         int aux = 0;
        for(String palavra : frase){
            char LetraInicial = palavra.charAt(0);
            String Maiusculo = palavra.toUpperCase();
            char LetraInicialMaiscula = Maiusculo.charAt(0);

            if(LetraInicial == LetraInicialMaiscula){
                aux++;
            }
        }
        return aux;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }
}
