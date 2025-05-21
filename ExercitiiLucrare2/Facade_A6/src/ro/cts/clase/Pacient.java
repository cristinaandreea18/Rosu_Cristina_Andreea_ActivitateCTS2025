package ro.cts.clase;

public class Pacient {
    private String nume;
    private int starePacient;

    public Pacient(String nume, int starePacient) {
        this.nume = nume;
        this.starePacient = starePacient;
    }

    public int getStarePacient() {
        return starePacient;
    }

    public void verificareGravitateStare(int stare){
        System.out.println("A fost verificata gravitatea starii");
    }
}
