package ro.cts.clase;

public class Loc implements ComponentaStadion {
    private int nrLoc;

    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public void adaugaComponentaStadion(ComponentaStadion componentaDeAdugat) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void stergeComponentaStadion(ComponentaStadion componentaDeSters) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void getComponentaStadion(int cheie) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void afiseazaComponentaStadion() {
        System.out.println("        Locul "+nrLoc);
    }
}
