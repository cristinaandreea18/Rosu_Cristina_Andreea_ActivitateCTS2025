package ro.cts.main;


import ro.cts.clase.AdapterObiecteMedicament;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ai venit la farmacia Bebe Tei");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[]args){
        MedicamentSpital medicament = new MedicamentSpital("Nurofen",35);
        MedicamentFarmacie medicament2 = new MedicamentFarmacie("Zynerit","30.12.2026",true,40);

        vindeMedicament(medicament2);

        AdapterObiecteMedicament adapter = new AdapterObiecteMedicament(medicament);
        vindeMedicament(adapter);
    }
}
