package ro.cts.main;

import ro.cts.clase.AdapterClaseMedicament;
import ro.cts.clase.IMedicamentFarmacie;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    private static void vindeMedicament(String numeFarmacie, IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Ne aflam la farmacia "+numeFarmacie);
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args){
        MedicamentSpital medicamentSpital = new MedicamentSpital("paracetamol",26.99f);
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("panadol baby","30.11.2029",true,25.99f);

        AdapterClaseMedicament adapter = new AdapterClaseMedicament(medicamentSpital);
        vindeMedicament("Catena",adapter);
    }
}
