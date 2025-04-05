package ro.cts.clase;

public abstract class Supa {
    private String timpDePreparare;
    private float pret;
    private float gramaj;

    public Supa(String timpDePreparare, float pret, float gramaj) {
        this.timpDePreparare = timpDePreparare;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    public String getTimpDePreparare() {
        return timpDePreparare;
    }

    public void setTimpDePreparare(String timpDePreparare) {
        this.timpDePreparare = timpDePreparare;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getGramaj() {
        return gramaj;
    }

    public void setGramaj(float gramaj) {
        this.gramaj = gramaj;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("timpDePreparare=").append(timpDePreparare);
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
