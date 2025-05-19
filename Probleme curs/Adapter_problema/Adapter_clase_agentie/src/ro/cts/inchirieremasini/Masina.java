package ro.cts.inchirieremasini;

public class Masina {
    private String model;
    private double capacitateCilindrica;

    public Masina(String model, double capacitateCilindrica) {
        this.model = model;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(double capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", capacitateCilindrica=").append(capacitateCilindrica);
        sb.append('}');
        return sb.toString();
    }
}
