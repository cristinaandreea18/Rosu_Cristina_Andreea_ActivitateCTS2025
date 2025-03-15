package ro.cts.clase;

public class AutoritateReglementareMasiniLazy {
    private String numeAutoritate;
    private String website;
    private int nrReglementari;

    private static AutoritateReglementareMasiniLazy instanta = new AutoritateReglementareMasiniLazy("Autoritate Auto","www.autoritate.ro",0);
    private AutoritateReglementareMasiniLazy(String numeAutoritate, String website, int nrReglementari) {
        this.numeAutoritate = numeAutoritate;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniLazy{");
        sb.append("numeAutoritate='").append(numeAutoritate).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String nume){
        nrReglementari++;
    }

    public static synchronized AutoritateReglementareMasiniLazy getInstance(String nume,String website){
        if(instanta==null) {
            instanta = new AutoritateReglementareMasiniLazy(nume,website,0);
        }
        return instanta;
    }
}
