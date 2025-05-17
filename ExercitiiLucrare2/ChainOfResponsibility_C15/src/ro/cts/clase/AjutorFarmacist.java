package ro.cts.clase;

public class AjutorFarmacist extends HandlerComanda {
    @Override
    public void trimiteComanda(String medicamente) {
        System.out.println("Ajutorul de farmacist aduce medicamentul "+medicamente+" din depozit");
    }
}
