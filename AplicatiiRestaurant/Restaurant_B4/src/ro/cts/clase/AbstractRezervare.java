package ro.cts.clase;

public abstract class AbstractRezervare {
    protected  int nrPersoane;
    protected String numeClient;
    protected String dataRezervare;
    protected int ora;

    public AbstractRezervare(int nrPersoane, String numeClient, String dataRezervare, int ora) {
        if(nrPersoane<2) {
            this.nrPersoane = 2;
        }
        else {
            this.nrPersoane = nrPersoane;
        }
        if(numeClient.length()>2) {
            this.numeClient = numeClient;
        }
        else {
            this.numeClient="Anonim";
        }
        this.dataRezervare = dataRezervare;
        if(ora>=10 && ora<=22) {
            this.ora = ora;
        }
        else {
            this.ora = 12;
        }
    }
    public AbstractRezervare(){
        this.nrPersoane = 3;
        this.numeClient = "Andrei";
        this.ora = 14;
        this.dataRezervare="13/04/2025";
    }

    public abstract AbstractRezervare copiaza(int ora);
    public void setOra(int ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrPersoane=").append(nrPersoane);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
