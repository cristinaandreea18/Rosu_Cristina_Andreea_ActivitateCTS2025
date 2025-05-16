package ro.cts.clase;

public class BiletGazda extends BiletDecorator {
    private String echipaLocala;

    public BiletGazda(Bilet bilet, String echipaLocala) {
        super(bilet);
        this.echipaLocala = echipaLocala;
    }

    @Override
    protected void printareMesaj() {
        System.out.println("Mesaj: Hai " + echipaLocala + "!");
    }
}
