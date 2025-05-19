package ro.cts.clase;


public class AsistentMedical extends HandlerAccidentare {

    @Override
    public void gestionareAccidentare(FisaAccident fisa) {
            if(fisa.getNivelGravitate()>=15){
                System.out.println("Se va chema medicul!");
                this.getHandler().gestionareAccidentare(fisa);
            }
            else {
                System.out.println("Asistentul medical evalueaza accidentarea ca fiind usoara si o trateaza");
            }
    }
}
