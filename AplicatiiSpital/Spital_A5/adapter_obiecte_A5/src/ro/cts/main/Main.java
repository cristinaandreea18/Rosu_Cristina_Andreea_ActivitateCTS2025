package ro.cts.main;

import ro.cts.clase.AdapterObiecteMedicament;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    private static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ai venit la farmacie!");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args){
        MedicamentSpital medicamentSpital = new MedicamentSpital("ibuprofen",24.99f);
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("nurofen forte","30.12.2027",true,35.79f);
        vindeMedicament(medicamentFarmacie);

        AdapterObiecteMedicament adapter = new AdapterObiecteMedicament(medicamentSpital);
        vindeMedicament(adapter);
        }
}
