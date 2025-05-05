package ro.cts.clase;

public class Zbor {
    private CompanieAeriana companieAeriana;
    private String orasPlecare;
    private String destinatie;

    public Zbor(CompanieAeriana companieAeriana, String orasPlecare, String destinatie) {
        this.companieAeriana = companieAeriana;
        this.orasPlecare = orasPlecare;
        this.destinatie = destinatie;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }

    public void setCompanieAeriana(CompanieAeriana companieAeriana) {
        this.companieAeriana = companieAeriana;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("companieAeriana=").append(companieAeriana);
        sb.append(", orasPlecare='").append(orasPlecare).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
