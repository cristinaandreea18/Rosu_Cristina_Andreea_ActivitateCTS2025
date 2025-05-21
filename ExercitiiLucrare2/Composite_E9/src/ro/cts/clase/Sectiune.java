package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaStadion {
    private String denumireSectiune;
    private List<ComponentaStadion>listaSectiuni;

    public Sectiune(String denumireSectiune) {
        this.listaSectiuni = new ArrayList<ComponentaStadion>();
        this.denumireSectiune = denumireSectiune;
    }

    @Override
    public void adaugaComponentaStadion(ComponentaStadion componentaDeAdugat) throws Exception {
        listaSectiuni.add(componentaDeAdugat);
    }

    @Override
    public void stergeComponentaStadion(ComponentaStadion componentaDeSters) throws Exception {
        listaSectiuni.remove(componentaDeSters);
    }

    @Override
    public void getComponentaStadion(int cheie) throws Exception {
        listaSectiuni.get(cheie);
    }

    @Override
    public void afiseazaComponentaStadion() {
        System.out.println("Componenta sectiune "+denumireSectiune);
        for(ComponentaStadion componenta: listaSectiuni){
            componenta.afiseazaComponentaStadion();
        }
    }
}
