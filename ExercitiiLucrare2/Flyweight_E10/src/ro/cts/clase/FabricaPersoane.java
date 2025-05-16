package ro.cts.clase;

import java.util.HashMap;

public class FabricaPersoane {
    private HashMap<Integer,AbstractPersoana>colectiePersoane;

    public FabricaPersoane() {
        this.colectiePersoane = new HashMap<Integer, AbstractPersoana> ();
    }

    public AbstractPersoana getPersoana(int pozitie,int inaltime,int latime){
        AbstractPersoana persoana = colectiePersoane.get(pozitie);
        if(persoana==null){
            persoana = new Persoana(latime,inaltime);
            colectiePersoane.put(pozitie,persoana);
        }
        return persoana;
    }

    public AbstractPersoana getPersoana(int pozitie) throws Exception{
        AbstractPersoana persoana = colectiePersoane.get(pozitie);
        if(persoana==null){
            throw new Exception("Persoana nu exista in tribuna!");
        }
        else{
            return persoana;
        }
    }
}
