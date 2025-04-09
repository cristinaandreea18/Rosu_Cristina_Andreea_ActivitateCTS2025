package ro.cts.main;

import ro.cts.clase.FabricaMedicamentDurere;
import ro.cts.clase.FabricaMedicamenteRaceala;
import ro.cts.clase.Medicament;
import ro.cts.clase.TipMedicament;

public class Main {
    public static void main(String[] args){
        FabricaMedicamentDurere fabricaMedicamentDurere = new FabricaMedicamentDurere("unguent");
        FabricaMedicamenteRaceala fabricaMedicamenteRaceala = new FabricaMedicamenteRaceala("nas infundat");
        Medicament medicamentDurere = fabricaMedicamentDurere.createMedicament(TipMedicament.DURERE,20,"Puterea ursului");
        Medicament medicamentRaceala = fabricaMedicamenteRaceala.createMedicament(TipMedicament.RACEALA,15,"Olynth");

        System.out.println(medicamentDurere);
        System.out.println(medicamentRaceala);
    }
}
