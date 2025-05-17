package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;
public class Sucursala extends UnitateBancara {
    private List<UnitateBancara>colectieSucursale;
    public Sucursala(String denumireUnitate) {
        super(denumireUnitate);
        this.colectieSucursale= new ArrayList<UnitateBancara>();
    }

    @Override
    public void adaugaUnitateBancara(UnitateBancara unitateBancaraDeAdaugat) {
        colectieSucursale.add(unitateBancaraDeAdaugat);
    }

    @Override
    public void stergeUnitateBancara(UnitateBancara unitateBancaraDeSters) {
        colectieSucursale.remove(unitateBancaraDeSters);
    }

    @Override
    public void descriereUnitateBancara() {
        System.out.println("Sucursala cu numele "+denumireUnitate+ " are urmatoarele agentii:");
        for(UnitateBancara unitate:colectieSucursale){
            System.out.println("------");
            unitate.descriereUnitateBancara();
        }
    }

    @Override
    public UnitateBancara getUnitateBancara(int cheie) {
        return colectieSucursale.get(cheie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sucursala{");
        sb.append("colectieSucursale=").append(colectieSucursale);
        sb.append(", denumireUnitate='").append(denumireUnitate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
