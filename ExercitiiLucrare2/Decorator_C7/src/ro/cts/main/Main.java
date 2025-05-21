package ro.cts.main;

import ro.cts.clase.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Medicament medicament1 = new Medicament("paracetamol",25);
        Medicament medicament2 = new Medicament("sirop de tuse",19);
        HashMap<Medicament,Integer> colectie = new HashMap<Medicament,Integer>();
        colectie.put(medicament1,1);
        colectie.put(medicament2,1);

        AbstractBon bon = new BonClasic("21.05.2025 10:30",colectie);
        bon.printare();
        System.out.println();
        AbstractBon bonDecorat = new FelicitareFarmacie(bon,"Catena");
        bonDecorat.printare();
    }
}
