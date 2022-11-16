import impl.Observador;
import impl.Observavel;

public class Main {
    public static void main(String[] args) {
        Observavel obs = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        obs.registraObservador(obs1);
        obs.registraObservador(obs2);
        obs.registraObservador(obs3);

        String frase= "Nao vou mais faltar nas aulas do Chris";

        obs.NumeroDePalavras(frase);
        obs.NumeroPares(frase);
        obs.NumeroPalavrasMaiusculas(frase);

        System.out.println("\n\nNotificando observadores");
        observavel.notificaObservadores();

        observavel.removeObservador(obs1);

        System.out.println("\n\nNotificando observadores");
        observavel.notificaObservadores();

    }
}