package ro.cts.clase;

public abstract class RezultateDecorator implements Rezultate {
    private Rezultate rezultate;

    public RezultateDecorator(Rezultate rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void furnizeaza() {
        rezultate.furnizeaza();
        printareRezultate();
    }

    protected abstract void printareRezultate();
}
