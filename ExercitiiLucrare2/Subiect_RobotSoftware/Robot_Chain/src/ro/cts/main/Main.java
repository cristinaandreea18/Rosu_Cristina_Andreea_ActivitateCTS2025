package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        IProcesatorCerere adeverinta = new ProcesatorAdeverinta();
        IProcesatorCerere diploma = new ProcesatorDiploma();
        IProcesatorCerere taxa = new ProcesatorTaxa();

        adeverinta.setNext(diploma);
        diploma.setNext(taxa);
        taxa.setNext(null);

        Cerere cerere1 = new Cerere("C1","adeverinta",false);
        adeverinta.proceseaza(cerere1);
        cerere1.setCategorie("taxa");
        cerere1.setUrgenta(true);
        adeverinta.proceseaza(cerere1);
        cerere1.setTip("T1");
        cerere1.setUrgenta(false);
        adeverinta.proceseaza(cerere1);
    }

}
