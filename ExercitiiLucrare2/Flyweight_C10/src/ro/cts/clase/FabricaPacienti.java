package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String,AbstractPacient>colectiePacienti;

    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<String,AbstractPacient>();
    }

   public AbstractPacient getPacient(String numarAsigurare) throws Exception {
        AbstractPacient pacient = colectiePacienti.get(numarAsigurare);
        if(pacient==null){
            throw new Exception("Pacientul nu exista");
        }
        else{
            return pacient;
        }
   }

   public AbstractPacient getPacient(String nume,String numarAsigurare){
        AbstractPacient pacient = colectiePacienti.get(numarAsigurare);
        if(pacient==null){
            pacient= new Pacient(nume,numarAsigurare);
            colectiePacienti.put(numarAsigurare,pacient);
        }
        return pacient;
   }
}
