package ro.cts.clase;

public class MasinaSUV extends AMasina {
    public MasinaSUV(String proprietar, int anFabricatie) {
        super(proprietar, anFabricatie);
    }

    @Override
    public void descriere() {
        System.out.println("Masina fabricata in anul "+anFabricatie+ " al carui proprietar este "+proprietar +" este un SUV");

    }
}
