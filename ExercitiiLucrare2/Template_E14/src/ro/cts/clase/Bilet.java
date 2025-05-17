package ro.cts.clase;

public class Bilet {
    private String detinatorBilet;
    private float pretBilet;
    private int locOcupat;
    private String codAcces;
    private boolean isVIP;

    public Bilet(String detinatorBilet, float pretBilet, int locOcupat) {
        this.detinatorBilet = detinatorBilet;
        this.pretBilet = pretBilet;
        this.locOcupat = locOcupat;
        this.codAcces = null;
        this.isVIP = false;
    }

    public void setCodAcces(String codAcces) {
        this.codAcces = codAcces;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public String getCodAcces() {
        return codAcces;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("detinatorBilet='").append(detinatorBilet).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append(", locOcupat=").append(locOcupat);
        sb.append('}');
        return sb.toString();
    }
}
