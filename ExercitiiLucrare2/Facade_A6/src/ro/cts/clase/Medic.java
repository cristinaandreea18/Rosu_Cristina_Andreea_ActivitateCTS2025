package ro.cts.clase;

public class Medic {
    public boolean verificareInternare(Pacient pacient){
        if(pacient.getStarePacient()>3){
            System.out.println("Este necesara internarea");
            return true;
        }
        else {
            return false;
        }
    }
}
