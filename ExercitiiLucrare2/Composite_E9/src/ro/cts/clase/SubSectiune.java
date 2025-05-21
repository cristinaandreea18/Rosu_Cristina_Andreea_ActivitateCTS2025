package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;
public class SubSectiune implements ComponentaStadion {
    String denumireSubSectiune;
    private List<ComponentaStadion>listaSubSeciuni;

    public SubSectiune( String denumireSubSectiune) {
        this.listaSubSeciuni = new ArrayList<ComponentaStadion> ();
        this.denumireSubSectiune = denumireSubSectiune;
    }

    @Override
    public void adaugaComponentaStadion(ComponentaStadion componentaDeAdugat) throws Exception {
        listaSubSeciuni.add(componentaDeAdugat);
    }

    @Override
    public void stergeComponentaStadion(ComponentaStadion componentaDeSters) throws Exception {
        listaSubSeciuni.remove(componentaDeSters);
    }

    @Override
    public void getComponentaStadion(int cheie) throws Exception {
        listaSubSeciuni.get(cheie);
    }

    @Override
    public void afiseazaComponentaStadion() {
        System.out.println("    Componenta subsectiune "+denumireSubSectiune);
        for(ComponentaStadion componentaStadion: listaSubSeciuni){
            componentaStadion.afiseazaComponentaStadion();
        }
    }
}
