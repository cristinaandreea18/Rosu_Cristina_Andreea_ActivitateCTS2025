package ro.cts.clase;

public class FelicitareFarmacie extends PrintareBon {
    private String denumireFarmacie;
    public FelicitareFarmacie(AbstractBon bilet,String denumireFarmacie) {
        super(bilet);
        this.denumireFarmacie = denumireFarmacie;
    }

    @Override
    protected void printareMesaj() {
        System.out.println(denumireFarmacie+ " va ureaza un calduros 'La multi ani!'");
    }
}
