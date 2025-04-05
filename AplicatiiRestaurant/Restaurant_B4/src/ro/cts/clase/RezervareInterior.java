package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare {
    private String muzicaFundal;

    public RezervareInterior(int nrPersoane, String numeClient, String dataRezervare, int ora, String muzicaFundal) {
        super(nrPersoane, numeClient, dataRezervare, ora);
        this.muzicaFundal = muzicaFundal;
    }

    public RezervareInterior(){
        super();
    }
    @Override
    public AbstractRezervare copiaza(int ora) {
        RezervareInterior rezervareInterior = new RezervareInterior();
        rezervareInterior.numeClient = this.numeClient;
        rezervareInterior.dataRezervare = this.dataRezervare;
        rezervareInterior.ora = ora;
        rezervareInterior.nrPersoane = this.nrPersoane;
        rezervareInterior.muzicaFundal = this.muzicaFundal;
        return rezervareInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("muzicaFundal='").append(muzicaFundal).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
