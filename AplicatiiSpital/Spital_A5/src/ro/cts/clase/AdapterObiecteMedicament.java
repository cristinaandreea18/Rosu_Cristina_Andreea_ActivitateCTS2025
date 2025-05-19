package ro.cts.clase;

public class AdapterObiecteMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterObiecteMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getDenumireMedicament(), "30.12.2029", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
