package ro.cts.clase;

public class FabricaSupa implements FabricaMancare {
    private int timpPreparare;

    public FabricaSupa(int timpPreparare) {
        this.timpPreparare = timpPreparare;
    }

    @Override
    public FelDeMancare creareFelMancare(TipMancare tip, float pret, float gramaj) {
        switch ((SUPE)tip){
            case SUPE.CIUPERCI -> {
                SupaCiuperci supaCiuperci = new SupaCiuperci(pret,gramaj,timpPreparare);
                return supaCiuperci;
            }
            case SUPE.LEGUME -> {
                SupaLegume supaLegume = new SupaLegume(pret,gramaj,timpPreparare);
                return supaLegume;
            }
            case SUPE.VITA -> {
                SupaVita supaVita = new SupaVita(pret,gramaj,timpPreparare);
                return supaVita;
            }
            default -> {
                return null;
            }
        }
    }
}
