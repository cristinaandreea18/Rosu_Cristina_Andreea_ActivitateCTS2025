package ro.cts.clase;

public class Cursant extends HandlerAccidentare {

    @Override
    public void gestionareAccidentare(FisaAccident fisa) {
        if(fisa.getNivelGravitate()>=5){
            System.out.println("Cursantul constata accidentarea!");
            this.getHandler().gestionareAccidentare(fisa);

        }
        else {
            System.out.println("Nu este cazul de o accidentare!");
        }
    }
}
