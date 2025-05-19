package ro.cts.clase;

public class MedicamentSpital {
    private String denumireMedicament;
    private float pret;

    public MedicamentSpital(String denumireMedicament, float pret) {
        this.denumireMedicament = denumireMedicament;
        this.pret = pret;
    }
    public boolean prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul "+denumireMedicament);
        return true;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul "+denumireMedicament+ " a fost achizitionat la pretul de "+pret);
        }else
        {
            System.out.println("Este necesara reteta pentru achizitionare");
        }
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public float getPret() {
        return pret;
    }
}
