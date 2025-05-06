package ro.cts.clase;

public class Medic {
    private String numeMedic;
    private String spital;

    public Medic(String numeMedic, String spital) {
        this.numeMedic = numeMedic;
        this.spital = spital;
    }

    public boolean verificareConfirmareMedic(Pacient pacient){
        return pacient.verificareGravitateStare();
    }

    public String getSpital() {
        return spital;
    }
}
