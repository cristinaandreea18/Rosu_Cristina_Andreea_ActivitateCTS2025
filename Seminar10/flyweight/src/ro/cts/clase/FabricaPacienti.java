package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, AbstractPacient> colectiePacienti;

    public FabricaPacienti() {
        colectiePacienti = new HashMap<String, AbstractPacient>();
    }

    public AbstractPacient getPacient(String telefon) throws Exception {
        AbstractPacient pacient = colectiePacienti.get(telefon);
        if(pacient==null){
            throw new Exception("Pacientul nu exista!");
        }
        else {
            return pacient;
        }
    }

    public AbstractPacient getPacient(String nume, String numarTelefon, String adresa){
        AbstractPacient pacient = colectiePacienti.get(numarTelefon);
        if(pacient==null){
            pacient = new Pacient(nume, numarTelefon,adresa);
            colectiePacienti.put(numarTelefon, pacient);
        }
        return pacient;
    }
}