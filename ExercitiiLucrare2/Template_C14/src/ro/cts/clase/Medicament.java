package ro.cts.clase;

public class Medicament {
    private String denumire;
    private int numarBucatiStoc;

    public Medicament(String denumire, int numarBucatiStoc) {
        this.denumire = denumire;
        this.numarBucatiStoc = numarBucatiStoc;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarBucatiStoc=").append(numarBucatiStoc);
        sb.append('}');
        return sb.toString();
    }

    public String getDenumire() {
        return denumire;
    }

    public void setNumarBucatiStoc(int numarBucatiStoc) {
        this.numarBucatiStoc = numarBucatiStoc;
    }

    public int getNumarBucatiStoc() {
        return numarBucatiStoc;
    }
}
