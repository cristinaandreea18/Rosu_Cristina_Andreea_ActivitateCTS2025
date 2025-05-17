package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiunePrincipala implements Categorie {
    private String denumireSectiune;
    private List<Categorie>listaSectiuni;

    public SectiunePrincipala(String denumireSectiune) {
        this.denumireSectiune = denumireSectiune;
        this.listaSectiuni = new ArrayList<Categorie>();
    }

    @Override
    public void adaugaCategorie(Categorie categorieDeAdaugat) {
        listaSectiuni.add(categorieDeAdaugat);
    }

    @Override
    public void stergeCategorie(Categorie categorieDeSters) {
        listaSectiuni.remove(categorieDeSters);
    }

    @Override
    public void afiseazaDescriere() throws Exception {
        System.out.println("Categoria principala "+denumireSectiune+" contine urmatoarele subsectiuni:");
        for(Categorie sectiunePrincipala: listaSectiuni){
            System.out.println("------");
            sectiunePrincipala.afiseazaDescriere();
        }
    }

    @Override
    public Categorie getCategorie(int cheie) {
        return listaSectiuni.get(cheie);
    }
}
