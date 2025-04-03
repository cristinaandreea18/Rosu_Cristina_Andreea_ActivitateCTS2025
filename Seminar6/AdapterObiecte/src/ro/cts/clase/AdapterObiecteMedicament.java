package ro.cts.clase;

public class AdapterObiecteMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterObiecteMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNumeMedicament(), "30.11.2027", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
