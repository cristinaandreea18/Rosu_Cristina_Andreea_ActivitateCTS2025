package ro.cts.clase;

import java.sql.SQLOutput;

public class VanzareBilet implements IBilet {
    @Override
    public void vindeBilet(String nume, float pretBilet, int varsta) {
        System.out.println("Persoana cu numele "+nume+" si varsta de "+varsta+ " a cumparat un bilet cu pretul de "+pretBilet);
    }
}
