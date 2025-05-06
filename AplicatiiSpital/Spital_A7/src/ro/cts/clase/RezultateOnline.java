package ro.cts.clase;

public class RezultateOnline extends RezultateDecorator {

    public RezultateOnline(Rezultate rezultate) {
        super(rezultate);
    }

    @Override
    protected void printareRezultate() {
        System.out.println("Se trimit rezultatele in format electronic");
    }
}
