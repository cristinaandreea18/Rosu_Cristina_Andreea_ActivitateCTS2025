package ro.cts.clase;

public class LocTribuna {
    private int pozitie;
    private String culoareTricou;

    public LocTribuna(int pozitie, String culoareTricou) {
        this.pozitie = pozitie;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocTribuna{");
        sb.append("pozitie=").append(pozitie);
        sb.append(", culoareTricou='").append(culoareTricou).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
