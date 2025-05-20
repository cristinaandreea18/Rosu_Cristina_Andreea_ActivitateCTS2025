package ro.cts.clase;

public class Farmacie extends TemplateFarmacie {
    @Override
    public void primesteReteta(Reteta reteta) {
        System.out.println("Farmacia a primit reteta");
    }

    @Override
    public boolean verificareMedicamenteInStoc(Medicament medicament, int cantitateDorita) {
        if(cantitateDorita<medicament.getNumarBucatiStoc()){
            System.out.println("Medicamentul "+medicament.getDenumire()+ " este disponibil la farmacie");
            return true;
        }
        return false;
    }

    @Override
    public boolean aducereMedicamenteDinDepozit(Medicament medicament) {
        System.out.println("Medicamentul "+ medicament.getDenumire()+ " a fost adus din depozitul farmaciei");
        return false;
    }

    @Override
    public void realizarePlata() {
        System.out.println("S-a realizat plata la farmacie");
    }

    @Override
    public void reducereCantitateDepozit(Medicament medicament,int cantitateDorita) {
        Integer cantitateRamasa = medicament.getNumarBucatiStoc()-cantitateDorita;
        medicament.setNumarBucatiStoc(cantitateRamasa);
        System.out.println("Pentru medicamentul "+medicament.getDenumire()+ " a ramas un numar de bucati "+cantitateRamasa);
    }

    @Override
    public void emitereBon() {
        System.out.println("Farmacia a emis bon");
    }
}
