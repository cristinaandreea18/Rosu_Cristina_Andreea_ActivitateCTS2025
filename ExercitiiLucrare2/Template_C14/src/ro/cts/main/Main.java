package ro.cts.main;

import ro.cts.clase.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        TemplateFarmacie farmacie = new Farmacie();
        Medicament medicament1 = new Medicament("augumentin",3);
        Medicament medicament2 = new Medicament("antinevralgic",5);
        Medicament medicament3 = new Medicament("coldrex",12);
        Medicament medicament4 = new Medicament("strepsils",6);

        HashMap<Medicament,Integer> colectieMedicamente1 = new HashMap<Medicament,Integer>();
        colectieMedicamente1.put(medicament1,1);
        colectieMedicamente1.put(medicament3,3);
        colectieMedicamente1.put(medicament4,1);

        Reteta reteta1 = new Reteta("R1",colectieMedicamente1);
        farmacie.proceduraAchizitieMedicamente(reteta1);

        TemplateFarmacie policlinica = new Policlinica();
        HashMap<Medicament,Integer> colectieMedicamente2 = new HashMap<Medicament,Integer>();
        colectieMedicamente2.put(medicament1,1);
        colectieMedicamente2.put(medicament2,1);
        colectieMedicamente2.put(medicament4,6);

        System.out.println();
        Reteta reteta2 = new Reteta("R2",colectieMedicamente2);
        policlinica.proceduraAchizitieMedicamente(reteta2);

    }
}
