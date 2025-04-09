package ro.cts.clase;

public class Factura {
    private int nrFactura;
    private int nrPungi;
    private boolean hasPlataCuCard;
    private boolean hasCardFidelitate;
    private double cotaTVA;

    public Factura(int nrFactura,int nrPungi, boolean hasPlataCuCard, boolean hasCardFidelitate, double cotaTVA) {
        this.nrFactura = nrFactura;
        this.nrPungi = nrPungi;
        this.hasPlataCuCard = hasPlataCuCard;
        this.hasCardFidelitate = hasCardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    protected void setNrFactura(int nrFactura) {
        this.nrFactura = nrFactura;
    }

    protected void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    protected void setHasPlataCuCard(boolean hasPlataCuCard) {
        this.hasPlataCuCard = hasPlataCuCard;
    }

    protected void setHasCardFidelitate(boolean hasCardFidelitate) {
        this.hasCardFidelitate = hasCardFidelitate;
    }

    protected void setCotaTVA(double cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("nrFactura=").append(nrFactura);
        sb.append(", nrPungi=").append(nrPungi);
        sb.append(", hasPlataCuCard=").append(hasPlataCuCard);
        sb.append(", hasCardFidelitate=").append(hasCardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
