package ro.cts.main;

import ro.cts.clase.Categorie;
import ro.cts.clase.Medicament;
import ro.cts.clase.SectiunePrincipala;
import ro.cts.clase.SubSectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        Categorie raceala = new SectiunePrincipala("Raceala");
        Categorie adulti = new SubSectiune("Adulti");
        Categorie copii = new SubSectiune("Copii");
        Categorie medicament1 = new Medicament("Nurofen");
        Categorie medicament2 = new Medicament("Fervex");
        Categorie medicament3 = new Medicament("Panadol Baby");

        try{
            raceala.adaugaCategorie(adulti);
            raceala.adaugaCategorie(copii);
            adulti.adaugaCategorie(medicament1);
            adulti.adaugaCategorie(medicament2);
            copii.adaugaCategorie(medicament3);

            raceala.afiseazaDescriere();
        }
        catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
