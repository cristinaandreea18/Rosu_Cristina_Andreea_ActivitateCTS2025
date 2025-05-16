package ro.cts.clase;

public abstract class BiletDecorator implements Bilet {
    private Bilet bilet;

    public BiletDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printare() {
        bilet.printare();
        printareMesaj();
    }

    protected abstract void printareMesaj();
}
