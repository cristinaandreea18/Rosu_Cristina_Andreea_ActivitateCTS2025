package ro.cts.main;

import ro.cts.clase.AdapterObiecteGestionareMedicamente;
import ro.cts.clase.MedicamenteDepozit;
import ro.cts.clase.VanzareFarmacie;

public class Main {
    private static void gestionareStocuri(MedicamenteDepozit medicamenteDepozit){
        medicamenteDepozit.verificaStocPentruMedicament(123,3);
    }

    public static void main(String[] args){
        VanzareFarmacie vanzareFarmacie = new VanzareFarmacie("paracetamol",123,5,20);
        System.out.println(vanzareFarmacie.toString());
        MedicamenteDepozit medicamenteDepozit= new MedicamenteDepozit("paracetamol",123,10);

        AdapterObiecteGestionareMedicamente adapter = new AdapterObiecteGestionareMedicamente(vanzareFarmacie);
        gestionareStocuri(adapter);
    }
}
