package ro.cts.main;

import ro.cts.clase.FacadeSpital;
import ro.cts.clase.Pacient;
import ro.cts.clase.Salon;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Pacient pacient = new Pacient("Ion",4);
        List<Integer>paturiLibere = new ArrayList<Integer>();
//        paturiLibere.add(1);
//        paturiLibere.add(2);
        List<Integer>paturiOcupate = new ArrayList<Integer>();
        paturiOcupate.add(3);
        paturiOcupate.add(4);
        paturiOcupate.add(5);

        Salon salon1 = new Salon(3,paturiLibere,paturiOcupate);
        FacadeSpital facade = new FacadeSpital();
        facade.internareSpital(pacient,salon1);

    }
}
