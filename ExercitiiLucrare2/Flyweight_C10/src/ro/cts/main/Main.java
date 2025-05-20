package ro.cts.main;

import ro.cts.clase.AbstractPacient;
import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.Pacient;
import ro.cts.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        FabricaPacienti fabricaPacienti= new FabricaPacienti();

        try {
            AbstractPacient pacient = fabricaPacienti.getPacient("Ion", "X1X2X3X");
            List<String> lista1 = new ArrayList<String>();
            lista1.add("Paracetamol");
            lista1.add("Nurofen");
            lista1.add("Rofedex");

            List<String> lista2 = new ArrayList<String>();
            lista2.add("Paracetamol2");
            lista2.add("Nurofen2");
            lista2.add("Rofedex2");
            Reteta reteta1 = new Reteta("R1", 100, 3, lista1);
            Reteta reteta2 = new Reteta("R2",105,3,lista2);


            fabricaPacienti.getPacient("Andrei","X1X2X3X4X5").descriePacient(reteta1);
            fabricaPacienti.getPacient("Andreea","x5x9").descriePacient(reteta2);
            fabricaPacienti.getPacient("X1X2X3X").descriePacient(reteta1);

        }
        catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
