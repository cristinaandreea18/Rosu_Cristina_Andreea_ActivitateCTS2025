package ro.cts.clase;

public class ItemsMeniu extends SectiuneMeniu {
    public ItemsMeniu(String numeSectiune) {
        super(numeSectiune);
    }

    @Override
    public void adaugaSectiune(SectiuneMeniu sectiuneNoua) throws Exception {
        throw new Exception ("Nu este implementata");
    }

    @Override
    public SectiuneMeniu getSectiune(int cheie) throws Exception {
        throw new Exception ("Nu este implementata");
    }

    @Override
    public void stergeSectiune(SectiuneMeniu sectiuneDeSters) throws Exception {
        throw new Exception ("Nu este implementata");

    }

    @Override
    public void afiseazaSectiune(String nivelIntermediar) {
        System.out.println("Descriere sectiune "+getNumeSectiune());
    }
}
