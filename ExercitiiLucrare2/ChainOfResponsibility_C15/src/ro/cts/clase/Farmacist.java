package ro.cts.clase;

public class Farmacist extends HandlerComanda {
    @Override
    public void trimiteComanda(String medicamente) {
        System.out.println("Farmacistul a preluat comanda si o trimite");
        if(urmatorul!=null){
            urmatorul.trimiteComanda(medicamente);
        }
    }
}
