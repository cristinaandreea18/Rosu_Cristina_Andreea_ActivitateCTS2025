package ro.cts.clase;

public class AdapterObiecteGestionareMedicamente extends MedicamenteDepozit {
    private VanzareFarmacie vanzareFarmacie;

    public AdapterObiecteGestionareMedicamente(VanzareFarmacie vanzareFarmacie) {
        super(vanzareFarmacie.getDenumireMedicament(), vanzareFarmacie.getCodMedicament(), vanzareFarmacie.getNumarBucatiInStoc());
        this.vanzareFarmacie = vanzareFarmacie;

    }

    public boolean verificaStocPentruMedicament(int codMedicament, int numarBucati){
        vanzareFarmacie.verificareDisponibilitate(codMedicament,numarBucati);
        return false;
    }
}
