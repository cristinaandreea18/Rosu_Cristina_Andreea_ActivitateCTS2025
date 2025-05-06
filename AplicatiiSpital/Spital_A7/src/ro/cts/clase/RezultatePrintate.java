package ro.cts.clase;

public class RezultatePrintate implements Rezultate {
    private String pacient;

    public RezultatePrintate(String pacient) {
        this.pacient = pacient;
    }

    @Override
    public void furnizeaza() {
        System.out.println("Se furnizeaza rezultate printate pentru "+pacient);
    }
}
