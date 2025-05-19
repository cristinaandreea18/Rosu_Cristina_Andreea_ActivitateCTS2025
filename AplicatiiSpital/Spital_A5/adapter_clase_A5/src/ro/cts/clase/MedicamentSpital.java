package ro.cts.clase;

public class MedicamentSpital {
    private String denumireMedicament;
    private float pret;

    public MedicamentSpital(String denumireMedicament, float pret) {
        this.denumireMedicament = denumireMedicament;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentSpital{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public float getPret() {
        return pret;
    }

    public boolean prezintaReteta(){
        System.out.println("A fost prezentata reteta aferenta medicamentului");
        return true;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()) {
            System.out.println("A fost achizitionat medicamentul " + denumireMedicament + " la pretul de " + pret);
        }
        else {
            System.out.println("Este necesara reteta!");
        }
    }
}
