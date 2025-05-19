package ro.cts.clase;

public class AdapterClaseGestionare extends VanzareFarmacie implements IDepozit {
    public AdapterClaseGestionare(VanzareFarmacie vanzareFarmacie) {
        super(vanzareFarmacie.getDenumireMedicament(), vanzareFarmacie.getCodMedicament(), vanzareFarmacie.getNumarBucatiInStoc(), vanzareFarmacie.getPretVanzare());
    }

    @Override
    public boolean verificaStocPentruMedicament(int codMedicament, int numarBucatiDorite) {
        return super.verificareDisponibilitate(codMedicament,numarBucatiDorite);
    }
}
