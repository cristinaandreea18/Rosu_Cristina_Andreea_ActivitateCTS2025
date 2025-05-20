package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.Medicament;
import ro.cts.clase.Reteta;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Andrei");
        Medicament medicament1 = new Medicament("agocalmin",4);
        Medicament medicament2 = new Medicament("nurofen forte",6);
        Medicament medicament3 = new Medicament("aspirina",5);

        HashMap<Medicament,Integer>colectieMedicamente = new HashMap<Medicament,Integer>();
        colectieMedicamente.put(medicament1,1);
        colectieMedicamente.put(medicament2,1);
        colectieMedicamente.put(medicament3,1);
        Reteta reteta1 = new Reteta("X1X2X3",colectieMedicamente);
        client1.poateSaAchizitionezeMedicamente(reteta1);
    }
}
