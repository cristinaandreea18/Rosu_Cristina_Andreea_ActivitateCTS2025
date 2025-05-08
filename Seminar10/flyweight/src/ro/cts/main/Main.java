package ro.cts.main;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.AbstractPacient;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();

        try {
            AbstractPacient pacient = fabrica.getPacient("Ion","0763451234", "ion@gmail.com");
            Spitalizare spitalizare = new Spitalizare(5,7,3);
            Spitalizare spitalizare1 = new Spitalizare(8,3,5);

            pacient.afiseazaPacient(spitalizare);
            pacient.afiseazaPacient(spitalizare1);

            Spitalizare spitalizare2 = new Spitalizare(7,6,7);
            Spitalizare spitalizare3 = new Spitalizare(9,2,6);

            fabrica.getPacient("Ioana", "0987654321", "ioana@gmail.com").afiseazaPacient(spitalizare2);
            fabrica.getPacient("0763451234").afiseazaPacient(spitalizare3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}