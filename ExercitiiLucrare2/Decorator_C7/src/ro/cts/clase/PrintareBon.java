package ro.cts.clase;

public abstract class PrintareBon implements AbstractBon {
    private AbstractBon bilet;

    public PrintareBon(AbstractBon bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printare() {
        bilet.printare();
        printareMesaj();
    }

    protected  abstract void printareMesaj();
}
