package ro.cts.clase;

public class AutoritateReglementareMasiniEager {
    private String numeAutoritate;
    private String website;
    private int nrReglementari;

    private static AutoritateReglementareMasiniEager instanta = new AutoritateReglementareMasiniEager("Autoritate Auto","www.autoritate.ro",10);
    private AutoritateReglementareMasiniEager(String numeAutoritate, String website, int nrReglementari) {
        this.numeAutoritate = numeAutoritate;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniEager{");
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

    public static AutoritateReglementareMasiniEager getInstance(){
        return instanta;
    }
}
