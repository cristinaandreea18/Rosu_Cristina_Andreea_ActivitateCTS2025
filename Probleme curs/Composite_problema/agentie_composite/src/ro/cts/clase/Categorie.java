package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuneMeniu {
    private List<OptiuneMeniu> listaOptiuni;
    private String nume;

    public Categorie(String nume) {
        listaOptiuni = new ArrayList<OptiuneMeniu>();
        this.nume = nume;
    }

    @Override
    public void adaugaOptiune(OptiuneMeniu optiune) {
        listaOptiuni.add(optiune);
    }

    @Override
    public void stergeOptiune(OptiuneMeniu optiune) {
        listaOptiuni.remove(optiune);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria "+nume);
        for(OptiuneMeniu opt:listaOptiuni){
            opt.descriere();
        }
    }

    @Override
    public OptiuneMeniu getOptiune(int pozitie) {
        return listaOptiuni.get(pozitie);
    }
}
