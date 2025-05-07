package ro.cts.main;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.IPacient;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args){
        FabricaPacienti fabrica = new FabricaPacienti();
        Spitalizare spitalizare1 = new Spitalizare(13,7,4,"picior rupt");
        Spitalizare spitalizare2 = new Spitalizare(17, 9,4,"hernie de disc");

        IPacient pacient = fabrica.getPacient("Ion");
        pacient.descriePacient(spitalizare1);
        pacient.descriePacient(spitalizare2);
    }
}
