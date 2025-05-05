package ro.cts.clase;

import java.sql.SQLOutput;

public class MasinaSEDAN extends AMasina {
    public MasinaSEDAN(String proprietar, int anFabricatie) {
        super(proprietar, anFabricatie);
    }

    @Override
    public void descriere() {
        System.out.println("Masina fabricata in anul "+ anFabricatie+ " al carui proprietar este "+proprietar +" este un SEDAN");
    }
}
