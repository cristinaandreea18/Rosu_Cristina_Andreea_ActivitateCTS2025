package ro.cts.clase;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println(denumire+" este un medicament pentru raceala, cu pretul de "+pret);
    }
}
