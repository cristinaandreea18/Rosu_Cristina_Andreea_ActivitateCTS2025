package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneRestaurant extends SectiuneMeniu {
    private List<SectiuneMeniu> subSectiuni;
    public SectiuneRestaurant(String numeSectiune) {
        super(numeSectiune);
        subSectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaSectiune(SectiuneMeniu sectiuneNoua) throws Exception {
        subSectiuni.add(sectiuneNoua);
    }

    @Override
    public SectiuneMeniu getSectiune(int cheie) throws Exception {
        return subSectiuni.get(cheie);
    }

    @Override
    public void stergeSectiune(SectiuneMeniu sectiuneDeSters) throws Exception {
        subSectiuni.remove(sectiuneDeSters);
    }

    @Override
    public void afiseazaSectiune(String nivelIntermediar) {
        System.out.println("Nivel intermediar "+super.getNumeSectiune()+":");
        for(SectiuneMeniu sectiune: subSectiuni){
            sectiune.afiseazaSectiune(nivelIntermediar);
        }
    }
}
