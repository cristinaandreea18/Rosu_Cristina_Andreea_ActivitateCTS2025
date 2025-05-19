package ro.cts.clase;

public class MedicamenteDepozit implements IDepozit {
    private String denumireMedicament;
    private int codMedicament;
    private int numarBucatiInStoc;

    public MedicamenteDepozit(String denumireMedicament, int codMedicament, int numarBucatiInStoc) {
        this.denumireMedicament = denumireMedicament;
        this.codMedicament = codMedicament;
        this.numarBucatiInStoc = numarBucatiInStoc;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public int getCodMedicament() {
        return codMedicament;
    }

    public int getNumarBucatiInStoc() {
        return numarBucatiInStoc;
    }

    public boolean verificaStocPentruMedicament(int codMedicament, int numarBucatiDorite){
        if(numarBucatiDorite<numarBucatiInStoc){
            numarBucatiInStoc-=numarBucatiDorite;
            System.out.println("Verificarea stocului aferent medicamentului cu codul "+codMedicament+ " a identificat ca numarul de "+numarBucatiDorite+ " bucati dorite se afla in stoc");
            return true;
        }
        else {
            System.out.println("Nu exista in stoc numarul de "+numarBucatiDorite);
            return false;
        }
    }
}
