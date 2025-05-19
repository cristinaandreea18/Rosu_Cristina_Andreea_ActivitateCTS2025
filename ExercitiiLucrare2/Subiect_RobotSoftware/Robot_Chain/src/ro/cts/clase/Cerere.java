package ro.cts.clase;

public class Cerere {
    private String tip;
    private String categorie;
    private boolean urgenta;

    public Cerere(String tip, String categorie, boolean urgenta) {
        this.tip = tip;
        this.categorie = categorie;
        this.urgenta = urgenta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cerere{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", categorie='").append(categorie).append('\'');
        sb.append(", urgenta=").append(urgenta);
        sb.append('}');
        return sb.toString();
    }

    public String getTip() {
        return tip;
    }

    public String getCategorie() {
        return categorie;
    }

    public boolean isUrgenta() {
        return urgenta;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setUrgenta(boolean urgenta) {
        this.urgenta = urgenta;
    }
}
