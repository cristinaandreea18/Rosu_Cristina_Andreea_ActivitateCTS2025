package ro.cts.clase;

public class VanzareFarmacie {
    private String denumireMedicament;
    private int codMedicament;
    private int numarBucatiInStoc;
    private float pretVanzare;

    public VanzareFarmacie(String denumireMedicament, int codMedicament, int numarBucati, float pretVanzare) {
        this.denumireMedicament = denumireMedicament;
        this.codMedicament = codMedicament;
        this.numarBucatiInStoc = numarBucati;
        this.pretVanzare = pretVanzare;
    }

    void setareMedicament(int codMedicament){
        System.out.println("Am ales medicamentul cu codul "+codMedicament);
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public int getCodMedicament() {
        return codMedicament;
    }

    public int getNumarBucatiInStoc() {
        return numarBucatiInStoc;
    }

    public float getPretVanzare() {
        return pretVanzare;
    }

    public boolean verificareDisponibilitate(int codMedicament, int numarBucatiDorite){
        setareMedicament(codMedicament);
        if(numarBucatiDorite<numarBucatiInStoc){
            numarBucatiInStoc-=numarBucatiDorite;
            System.out.println("Se poate achizitiona un numar de "+numarBucatiDorite+ " bucati aferente medicamentului "+denumireMedicament+ " la petul de "+pretVanzare);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VanzareFarmacie{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", codMedicament=").append(codMedicament);
        sb.append(", numarBucatiInStoc=").append(numarBucatiInStoc);
        sb.append(", pretVanzare=").append(pretVanzare);
        sb.append('}');
        return sb.toString();
    }
}
