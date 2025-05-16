package ro.cts.clase;

public class Peluza implements AbstractVerificareSpectator {
    @Override
    public void verificaSpectator() {
        System.out.println("Verificarea s-a realizat atat pentru bagaje,cat si pentru hainele purtate!");
    }
}
