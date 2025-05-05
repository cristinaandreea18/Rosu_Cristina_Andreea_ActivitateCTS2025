package ro.cts.clase;

public class ABicicleta implements IBicicleta {
    private double pretVanzare;
    private float dimensiuneRoti;

    public ABicicleta(double pretVanzare, float dimensiuneRoti) {
        this.pretVanzare = pretVanzare;
        this.dimensiuneRoti = dimensiuneRoti;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public float getDimensiuneRoti() {
        return dimensiuneRoti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ABicicleta{");
        sb.append("pretVanzare=").append(pretVanzare);
        sb.append(", dimensiuneRoti=").append(dimensiuneRoti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {

    }
}
