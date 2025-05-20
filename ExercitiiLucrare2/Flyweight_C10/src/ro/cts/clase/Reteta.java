package ro.cts.clase;

import java.util.List;

public class Reteta {
    private String numarReteta;
    private float sumaPlata;
    private int numarMedicamente;
    private List<String> listaMedicamente;

    public Reteta(String numarReteta, float sumaPlata, int numarMedicamente, List<String> listaMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaPlata = sumaPlata;
        this.numarMedicamente = numarMedicamente;
        this.listaMedicamente = listaMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numarReteta='").append(numarReteta).append('\'');
        sb.append(", sumaPlata=").append(sumaPlata);
        sb.append(", numarMedicamente=").append(numarMedicamente);
        sb.append(", listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }

    public String getNumarReteta() {
        return numarReteta;
    }

    public float getSumaPlata() {
        return sumaPlata;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }
}
