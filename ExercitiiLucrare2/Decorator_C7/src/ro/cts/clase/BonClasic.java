package ro.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class BonClasic implements AbstractBon {
    private String dataSiOraImprimare;
    private HashMap<Medicament,Integer>colectieMedicamente;

    public BonClasic(String dataImprimare,HashMap<Medicament,Integer>colectie) {
        this.colectieMedicamente = colectie;
        this.dataSiOraImprimare = dataImprimare;
    }

    @Override
    public void printare() {
        System.out.println("A fost printat bonul ce contine urmatoarele medicamente:");
        for(Map.Entry<Medicament,Integer>entry: colectieMedicamente.entrySet()){
            Medicament medicament = entry.getKey();
            Integer cantitate = entry.getValue();
            System.out.println("Medicamentul "+medicament+ " in cantitatea "+cantitate + " bucati");
        }
    }
}
