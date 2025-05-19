package ro.cts.clase;

public class Antrenor extends HandlerAccidentare {

    @Override
    public void gestionareAccidentare(FisaAccident fisa) {
        if(fisa.getNivelGravitate()>=10){
            System.out.println("Antrenorul va chema asistentul medical!");
            this.handler.gestionareAccidentare(fisa);
        }
        else {
            System.out.println("Nu se va chema asistentul medical!");
        }
    }
}
