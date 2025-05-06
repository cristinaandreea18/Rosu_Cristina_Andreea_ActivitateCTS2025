package ro.cts.clase;

public class Pacient {
    private String numePacient;
    private int varsta;
    private int gradImbolnavire;
    private String medic;

    public Pacient(String numePacient, int varsta, int gradImbolnavire, String medic) {
        this.numePacient = numePacient;
        this.varsta = varsta;
        this.gradImbolnavire = gradImbolnavire;
        this.medic = medic;
    }

    public int getGradImbolnavire() {
        return gradImbolnavire;
    }

    public boolean verificareGravitateStare(){
        return getGradImbolnavire()>3;
    }
}
