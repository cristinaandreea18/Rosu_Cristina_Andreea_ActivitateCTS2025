package ro.cts.clase;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println(denumire+" este un medicament pentru durere, cu pretul de "+pret);
    }
}
