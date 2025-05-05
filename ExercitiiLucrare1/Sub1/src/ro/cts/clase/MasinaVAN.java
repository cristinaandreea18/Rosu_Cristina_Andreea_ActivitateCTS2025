package ro.cts.clase;

public class MasinaVAN extends AMasina {
    public MasinaVAN(String proprietar, int anFabricatie) {
        super(proprietar, anFabricatie);
    }

    @Override
    public void descriere() {
        System.out.println("Masina fabricata in anul "+anFabricatie+ " al carui proprietar este "+proprietar +" este un VAN");

    }
}
