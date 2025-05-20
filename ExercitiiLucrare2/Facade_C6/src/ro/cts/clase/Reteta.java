package ro.cts.clase;

import java.util.HashMap;

public class Reteta {
    private String codReteta;
    private HashMap<Medicament,Integer>colectieMedicamente;

    public Reteta(String codReteta, HashMap<Medicament, Integer> colectieMedicamente) {
        this.codReteta = codReteta;
        this.colectieMedicamente = colectieMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("codReteta='").append(codReteta).append('\'');
        sb.append(", colectieMedicamente=").append(colectieMedicamente);
        sb.append('}');
        return sb.toString();
    }

    public HashMap<Medicament, Integer> getColectieMedicamente() {
        return colectieMedicamente;
    }

    public boolean esteVerificata(){
        System.out.println("Reteta cu codul "+codReteta+" a fost verificata! ");
        return true;
    }
}
