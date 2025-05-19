package ro.cts.clase;

public class Medic extends HandlerAccidentare {
    @Override
    public void gestionareAccidentare(FisaAccident fisa) {
        if(fisa.getNivelGravitate()>=20){
            System.out.println("Se va chema ambulanta!");
        }
        else {
            System.out.println("Asistentul medical evalueaza accidentarea ca fiind medie si o trateaza");
        }
    }
}
