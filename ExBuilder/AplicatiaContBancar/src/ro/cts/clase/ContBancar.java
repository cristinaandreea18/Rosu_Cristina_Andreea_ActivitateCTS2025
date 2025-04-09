package ro.cts.clase;

public class ContBancar {
    private String detinator;
    private double sumaBlocata;
    private double suma;
    private String moneda;

    private boolean cardAtasat;
    private boolean contSalariu;
    private boolean internetBanking;

    public ContBancar() {
    }

    public ContBancar(String detinator, double sumaBlocata, double suma, String moneda, boolean cardAtasat, boolean contSalariu, boolean internetBanking) {
        this.detinator = detinator;
        this.sumaBlocata = sumaBlocata;
        this.suma = suma;
        this.moneda = moneda;
        this.cardAtasat = cardAtasat;
        this.contSalariu = contSalariu;
        this.internetBanking = internetBanking;
    }

    protected void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    protected void setSumaBlocata(double sumaBlocata) {
        this.sumaBlocata = sumaBlocata;
    }

    protected void setSuma(double suma) {
        this.suma = suma;
    }

    protected void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", sumaBlocata=").append(sumaBlocata);
        sb.append(", suma=").append(suma);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", contSalariu=").append(contSalariu);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
