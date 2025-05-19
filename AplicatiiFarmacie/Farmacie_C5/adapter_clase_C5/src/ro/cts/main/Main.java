package ro.cts.main;

import ro.cts.clase.AdapterClaseGestionare;
import ro.cts.clase.IDepozit;
import ro.cts.clase.MedicamenteDepozit;
import ro.cts.clase.VanzareFarmacie;

public class Main {
    private static void gestionareStocuri(IDepozit medicamenteDepozit){
        medicamenteDepozit.verificaStocPentruMedicament(123,3);
    }

    public static void main(String[] args){
        VanzareFarmacie vanzareFarmacie = new VanzareFarmacie("paracetamol",123,5,20);
        IDepozit medicamenteDepozit = new MedicamenteDepozit("paracetamol",123,10);

        IDepozit adapter = new AdapterClaseGestionare(vanzareFarmacie);
        gestionareStocuri(adapter);

    }
}
