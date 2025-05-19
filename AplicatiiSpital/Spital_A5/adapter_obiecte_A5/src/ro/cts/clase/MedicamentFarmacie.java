package ro.cts.clase;

public class MedicamentFarmacie {
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

    public void cumparaMedicament(){
        System.out.println("Medicamentul "+denumireMedicament+ " expira la data de "+dataExpirare+ " si are pretul de "+pret);
    }
}
