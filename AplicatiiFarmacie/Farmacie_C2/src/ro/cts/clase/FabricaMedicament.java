package ro.cts.clase;

public interface FabricaMedicament {
    public Medicament createMedicament(TipMedicament tip,float pret, String denumire);
}
