package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;
public class Agentie extends UnitateBancara {
    private List<UnitateBancara>colectieAgentii;
    public Agentie(String denumireUnitate) {
        super(denumireUnitate);
        this.colectieAgentii= new ArrayList<UnitateBancara>();
    }

    @Override
    public void adaugaUnitateBancara(UnitateBancara unitateBancaraDeAdaugat) {
        colectieAgentii.add(unitateBancaraDeAdaugat);
    }

    @Override
    public void stergeUnitateBancara(UnitateBancara unitateBancaraDeSters) {
        colectieAgentii.remove(unitateBancaraDeSters);
    }

    @Override
    public void descriereUnitateBancara() {
        System.out.println("Agentia cu numele "+denumireUnitate+ " are urmatoarele filiale:");
        for(UnitateBancara unitate:colectieAgentii){
            System.out.println("---");
            unitate.descriereUnitateBancara();
        }
    }

    @Override
    public UnitateBancara getUnitateBancara(int cheie) {
        return colectieAgentii.get(cheie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("colectieAgentii=").append(colectieAgentii);
        sb.append(", denumireUnitate='").append(denumireUnitate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
