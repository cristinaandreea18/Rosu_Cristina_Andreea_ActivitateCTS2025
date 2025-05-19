package ro.cts.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String denumireMedicament;
    private String dataExpirare;
    private boolean esteInStoc;
    private float pret;

    public MedicamentFarmacie(String denumireMedicament, String dataExpirare, boolean esteInStoc, float pret) {
        this.denumireMedicament = denumireMedicament;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }


    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul "+denumireMedicament+" expira la data de "+dataExpirare+ " si a fost cumparat cu pretul de "+pret);
    }
}
