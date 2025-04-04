package ro.cts.clase;

public class RezervareCina implements IRezervare {
    private String nume;
    private int nrPersoane;
    private String nrContact;
    private boolean servesteDesert;

    public RezervareCina() {
        this.nume="Alin";
        this.nrPersoane=1;
        this.nrContact="0876541239";
        this.servesteDesert=true;
    }

    public RezervareCina(String nume, int nrPersoane, String nrContact,boolean servesteDesert) {
        super();
        this.nume = nume;
        if(nrPersoane>1) {
            this.nrPersoane = nrPersoane;
        }
        else
            this.nrPersoane= 1;
        if(nrContact.length()==10) {
            this.nrContact = nrContact;
        }
        else
            this.nrContact ="0765431230";
        this.servesteDesert = servesteDesert;
    }

    @Override
    public IRezervare copiaza(String nume) {
        RezervareCina rezervareCina = new RezervareCina();
        rezervareCina.nume = nume;
        rezervareCina.nrPersoane = this.nrPersoane;
        rezervareCina.nrContact = this.nrContact;
        rezervareCina.servesteDesert = this.servesteDesert;
        return rezervareCina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareCina{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrContact='").append(nrContact).append('\'');
        sb.append(", servesteDesert=").append(servesteDesert);
        sb.append('}');
        return sb.toString();
    }
}
