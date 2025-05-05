package ro.cts.clase;

public abstract class MijlocTransport {
    private int nrLocuri;
    private int nr;
    private String zonaReferintaTransport;

    public MijlocTransport(int nrLocuri, int nr, String zonaReferintaTransport) {
        this.nrLocuri = nrLocuri;
        this.nr = nr;
        this.zonaReferintaTransport = zonaReferintaTransport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("nrLocuri=").append(nrLocuri);
        sb.append(", nr=").append(nr);
        sb.append(", zonaReferintaTransport='").append(zonaReferintaTransport).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
