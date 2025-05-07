package ro.cts.clase;

public abstract class SectiuneMeniu {
    private String numeSectiune;

    public SectiuneMeniu(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    public abstract void adaugaSectiune(SectiuneMeniu sectiuneNoua) throws Exception;
    public abstract SectiuneMeniu getSectiune(int cheie) throws Exception;
    public abstract void stergeSectiune(SectiuneMeniu sectiuneDeSters) throws Exception;
    public abstract void afiseazaSectiune(String nivelIntermediar);

    public String getNumeSectiune() {
        return numeSectiune;
    }

    public void setNumeSectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }
}
