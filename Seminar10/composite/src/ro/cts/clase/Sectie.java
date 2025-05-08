package ro.cts.clase;

public class Sectie implements Structura {
    private String numeSectie;

    public Sectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia "+numeSectie);
    }

    @Override
    public Structura getStructura(int cheie) throws Exception {
        throw new Exception("NU este implementata");
    }
}
