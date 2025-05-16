package ro.cts.clase;

public class Tribuna implements AbstractVerificareSpectator {
    @Override
    public void verificaSpectator() {
        System.out.println("Verificarea s-a realizat doar pentru bagajele pe care le detin!");
    }
}
