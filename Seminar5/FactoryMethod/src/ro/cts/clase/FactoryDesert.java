package ro.cts.clase;

public class FactoryDesert implements AbstractFactory {
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, float pret,float calorii) {
        switch ((DESERT) tip){
            case DESERT.TIRAMISU -> {
                return new Tiramisu(pret,calorii,crema);

            }
            case DESERT.PAPANASI -> {
                return new Papanasi(pret,calorii,crema);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
