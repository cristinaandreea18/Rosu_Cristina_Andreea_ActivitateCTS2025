package ro.cts.clase;

public class FabricaDesert implements FabricaMancare {
    private String aroma;

    public FabricaDesert(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public FelDeMancare creareFelMancare(TipMancare tip,float pret,float gramaj) {
        switch((DESERT)tip){
            case DESERT.TIRAMISU -> {
                Tiramisu tiramisu = new Tiramisu(pret,gramaj,aroma);
                return tiramisu;
            }
            case DESERT.PAPANASI ->
            {   Papanasi papanasi = new Papanasi(pret,gramaj,aroma);
                return  papanasi;
            }
            default -> {
                return null;
            }
        }
    }
}
