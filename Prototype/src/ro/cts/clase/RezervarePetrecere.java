package ro.cts.clase;

public class RezervarePetrecere implements IRezervare{
    private String nume;
    private int nrPersoane;
    private String nrContact;
    private String temaPetrecere;

    public RezervarePetrecere() {
        this.nume="Gigel";
        this.nrPersoane=1;
        this.nrContact="0876541239";
        this.temaPetrecere="aniversare";
    }

    public RezervarePetrecere(String nume, int nrPersoane, String nrContact,String temaPetrecere) {
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
        this.temaPetrecere = temaPetrecere;
    }
    @Override
    public IRezervare copiaza(String nume) {
        RezervarePetrecere rezervarePetrecere = new RezervarePetrecere();
        rezervarePetrecere.nume = nume;
        rezervarePetrecere.nrPersoane = this.nrPersoane;
        rezervarePetrecere.nrContact = this.nrContact;
        rezervarePetrecere.temaPetrecere= this.temaPetrecere;
        return rezervarePetrecere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervarePetrecere{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrContact='").append(nrContact).append('\'');
        sb.append(", temaPetrecere='").append(temaPetrecere).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
