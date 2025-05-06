package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;
public class ManagerPachete {
    private List<MementoPachetTuristic> listaPachete=new ArrayList<>();

    public void adaugaMemento(MementoPachetTuristic pachet){
        listaPachete.add(pachet);
    }

    public MementoPachetTuristic getMemento(int pozitie){
       return listaPachete.get(pozitie);
    }

    public MementoPachetTuristic getLastMemento() throws Exception{
        if(listaPachete.size()!=0){
            MementoPachetTuristic memento = listaPachete.get(listaPachete.size()-1);
            listaPachete.remove(listaPachete.size()-1);
            return memento;
        }
        else {
            throw new Exception("Nu exista stari salvate");
        }
    }
}
