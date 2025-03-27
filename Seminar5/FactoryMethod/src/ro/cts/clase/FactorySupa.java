package ro.cts.clase;

public class FactorySupa implements AbstractFactory {
    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, float pret,float calorii) {
        switch ((SUPE)tip){
            case SUPE.LEGUME -> {
                return new SupaLegume(pret,calorii,cantitate);

            }
            case SUPE.CIUPERCI -> {
                return new SupaCiuperci(pret,calorii,cantitate);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
