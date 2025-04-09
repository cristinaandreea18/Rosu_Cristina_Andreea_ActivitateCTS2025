package ro.cts.main;

import ro.cts.clase.Medicament;
import ro.cts.clase.factory.FabricaMedicament;
import ro.cts.clase.factory.TipMedicament;

public class Main {
    public static void main(String[]args){
        FabricaMedicament fabricaMedicament = new FabricaMedicament("Catena");
        Medicament medicamentDurere = fabricaMedicament.createMedicament(TipMedicament.DURERE,35,"ketonal");
        Medicament medicamentRaceala = fabricaMedicament.createMedicament(TipMedicament.RACEALA,19,"coldrex");
        medicamentRaceala.descriere();
        medicamentDurere.descriere();
    }
}
