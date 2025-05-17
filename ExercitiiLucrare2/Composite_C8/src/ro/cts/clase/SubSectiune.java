package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SubSectiune implements Categorie {
    private String denumireSubSectiune;
    private List<Categorie> listaSubSeciuni;

    public SubSectiune(String denumireSubSectiune) {
        this.denumireSubSectiune = denumireSubSectiune;
        this.listaSubSeciuni = new ArrayList<Categorie>();
    }

    @Override
    public void adaugaCategorie(Categorie categorieDeAdaugat) {
        listaSubSeciuni.add(categorieDeAdaugat);
    }

    @Override
    public void stergeCategorie(Categorie categorieDeSters) {
        listaSubSeciuni.remove(categorieDeSters);
    }

    @Override
    public void afiseazaDescriere() throws Exception {
        System.out.println("Categoria secundara "+denumireSubSectiune+" contine urmatoarele subsectiuni:");
        for(Categorie sectiunePrincipala: listaSubSeciuni){
            sectiunePrincipala.afiseazaDescriere();
        }
    }

    @Override
    public Categorie getCategorie(int cheie) {
        return listaSubSeciuni.get(cheie);
    }
}
