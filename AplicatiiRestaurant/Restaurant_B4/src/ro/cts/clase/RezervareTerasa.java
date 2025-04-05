package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare {
    private boolean accesBar;

    public RezervareTerasa(int nrPersoane, String numeClient, String dataRezervare, int ora, boolean accesBar) {
        super(nrPersoane, numeClient, dataRezervare, ora);
        this.accesBar = accesBar;
    }

    public RezervareTerasa(){
        super();
    }
    @Override
    public AbstractRezervare copiaza(int ora) {
        RezervareTerasa rezervareTerasa = new RezervareTerasa();
        rezervareTerasa.numeClient = this.numeClient;
        rezervareTerasa.nrPersoane = this.nrPersoane;
        rezervareTerasa.dataRezervare = this.dataRezervare;
        rezervareTerasa.ora = ora;
        rezervareTerasa.accesBar = this.accesBar;
        return rezervareTerasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTerasa{");
        sb.append("accesBar=").append(accesBar);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
