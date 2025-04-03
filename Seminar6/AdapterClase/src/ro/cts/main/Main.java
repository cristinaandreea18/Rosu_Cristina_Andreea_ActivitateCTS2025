package ro.cts.main;

import ro.cts.clase.AdapterClaseMedicament;
import ro.cts.clase.Farmacie;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void main(String[]args){
        Farmacie farmacie = new Farmacie("Help Net");
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Panadol","31.12.2028",true,27);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Paracetamol","31.12.2028",true,30);

        farmacie.vindeMedicament(medicamentFarmacie1);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Sirop",30);
        AdapterClaseMedicament adapter = new AdapterClaseMedicament("Sirop",40);
        farmacie.vindeMedicament(adapter);
    }
}
