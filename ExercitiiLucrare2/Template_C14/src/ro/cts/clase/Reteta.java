package ro.cts.clase;

import java.util.HashMap;
import java.util.List;

public class Reteta {
    private String numarReteta;
    private HashMap<Medicament,Integer> listaMedicamente;

    public Reteta(String numarReteta, HashMap<Medicament,Integer> listaMedicamente) {
        this.numarReteta = numarReteta;
        this.listaMedicamente = listaMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numarReteta='").append(numarReteta).append('\'');
        sb.append(", listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }

    public HashMap<Medicament,Integer> getListaMedicamente() {
        return listaMedicamente;
    }

}
