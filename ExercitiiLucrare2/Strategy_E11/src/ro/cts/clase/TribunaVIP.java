package ro.cts.clase;

public class TribunaVIP implements AbstractVerificareSpectator {

    @Override
    public void verificaSpectator() {
        System.out.println("Verificarea s-a realizat doar pe baza biletului!");
    }
}
