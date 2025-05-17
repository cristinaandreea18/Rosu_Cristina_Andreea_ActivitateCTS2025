package ro.cts.main;

import ro.cts.clase.Agentie;
import ro.cts.clase.Filiala;
import ro.cts.clase.Sucursala;
import ro.cts.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala = new Sucursala("Sucursala Nationala");
        UnitateBancara agentie = new Agentie("Agentia Transilvania");
        UnitateBancara filiala = new Filiala("Filiala Cluj");
        UnitateBancara filiala2 = new Filiala("Filiala Turda");
        UnitateBancara filiala4 = new Filiala("Filiala Sibiu");
        UnitateBancara filiala5 = new Filiala("Filiala Brasov");


        UnitateBancara agentie2 = new Agentie("Agentia Moldova");
        UnitateBancara filiala3 = new Filiala("Filiala Iasi");

        try {
            sucursala.adaugaUnitateBancara(agentie);
            sucursala.adaugaUnitateBancara(agentie2);
            agentie.adaugaUnitateBancara(filiala2);
            agentie.adaugaUnitateBancara(filiala);
            agentie.adaugaUnitateBancara(filiala4);
            agentie.adaugaUnitateBancara(filiala5);

            agentie2.adaugaUnitateBancara(filiala3);
            sucursala.descriereUnitateBancara();

            System.out.println(sucursala.getUnitateBancara(0));
            System.out.println(agentie.getUnitateBancara(2));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
