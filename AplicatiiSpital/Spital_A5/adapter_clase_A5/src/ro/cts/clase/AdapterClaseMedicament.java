package ro.cts.clase;

public class AdapterClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie {
    public AdapterClaseMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getDenumireMedicament(),medicamentSpital.getPret());
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
