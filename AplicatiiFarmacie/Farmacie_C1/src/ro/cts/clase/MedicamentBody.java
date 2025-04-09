package ro.cts.clase;

public class MedicamentBody extends Medicament {
    public MedicamentBody(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println(denumire+" este un medicament pentru body, cu pretul de "+pret);
    }
}
