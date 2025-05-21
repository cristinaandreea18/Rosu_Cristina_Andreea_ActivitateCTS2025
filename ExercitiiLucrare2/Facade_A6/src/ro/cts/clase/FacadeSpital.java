package ro.cts.clase;

public class FacadeSpital {
    public void internareSpital(Pacient pacient,Salon salon){
        pacient.verificareGravitateStare(pacient.getStarePacient());
        Medic medic = new Medic();
        if(medic.verificareInternare(pacient)){
            if(salon.verificareDisponibilitateSalon(salon.getNumarSalon())){
                System.out.println("Internare cu succes!");
            }
            else {
                System.out.println("Nu avem paturi disponibile!");
            }
        }
        else {
            System.out.println("Medicul nu valideaza internarea!");
        }
    }
}
