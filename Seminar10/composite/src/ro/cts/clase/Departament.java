package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDepartament;
    private int nrAngajati;
    private List<Structura> liste;

    public Departament(String numeDepartament,int nrAngajati) {
        this.numeDepartament = numeDepartament;
        this.nrAngajati = nrAngajati;
        liste = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        liste.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        liste.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul "+numeDepartament +" are un numar de "+nrAngajati+" si urmatoarele subsectii");
        for(Structura structura:liste){
            structura.afiseazaDescriere();
        }
    }

    @Override
    public Structura getStructura(int cheie) throws Exception {
        return liste.get(cheie);
    }
}
