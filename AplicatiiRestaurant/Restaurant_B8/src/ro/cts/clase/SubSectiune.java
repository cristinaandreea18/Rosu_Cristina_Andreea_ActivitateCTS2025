package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SubSectiune extends SectiuneMeniu {
    private List<SectiuneMeniu> itemsMeniu;
    public SubSectiune(String numeSectiune) {
        super(numeSectiune);
        this.itemsMeniu = new ArrayList<>();
    }

    @Override
    public void adaugaSectiune(SectiuneMeniu sectiuneNoua) {
        itemsMeniu.add(sectiuneNoua);
    }

    @Override
    public SectiuneMeniu getSectiune(int cheie) {
        return itemsMeniu.get(cheie);
    }

    @Override
    public void stergeSectiune(SectiuneMeniu sectiuneDeSters) {
        itemsMeniu.remove(sectiuneDeSters);
    }

    @Override
    public void afiseazaSectiune(String nivelIntermediar) {
        System.out.println("Nivel intermediar "+super.getNumeSectiune()+":");
        for(SectiuneMeniu item: itemsMeniu){
            item.afiseazaSectiune(nivelIntermediar);
        }
    }
}
