package ro.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public void poateSaAchizitionezeMedicamente(Reteta reteta){
        Boolean sePoateAchizitiona=true;
        Farmacist farmacist = new Farmacist("Catena");
        if(reteta.esteVerificata()){
            HashMap<Medicament,Integer>colectieMedicamente = reteta.getColectieMedicamente();
            for(Map.Entry<Medicament,Integer>entry: colectieMedicamente.entrySet()){
                int cantitateDorita = entry.getValue();
                Medicament medicament = entry.getKey();
                if(medicament.esteDispnibil(cantitateDorita)){
                }
                else {
                    sePoateAchizitiona=false;
                    System.out.println("Nu este disponibila cantitatea "+cantitateDorita+ " pentru medicamentul "+medicament.getNume());
                }
            }
            if(sePoateAchizitiona==true){
                farmacist.verificareCardSanatate();
                System.out.println("S-a realizat achizitia medicamentelor din reteta!");
            }
            else {
                System.out.println("Nu se pot achizitiona!");
            }
        }
        else {
            System.out.println("Trebuie prezentata reteta pentru verificare!");
        }
    }
}
