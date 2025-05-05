package ro.cts.main;

import ro.cts.clase.ACuptor;
import ro.cts.clase.Cuptor;
import ro.cts.clase.CuptorSR;
import ro.cts.clase.Preparat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Preparat p1 = new Preparat("macaroane",60,180);
        Preparat p2 = new Preparat("pizza",75,200);
        List<Preparat> preparate = new ArrayList<>();
        preparate.add(p1);
        preparate.add(p2);

        CuptorSR c1 = CuptorSR.getInstance("Entourage",20000,preparate);
        System.out.println(c1);
        CuptorSR c2 = CuptorSR.getInstance("Coca Cola",10000,preparate);
        System.out.println(c2);


        ACuptor cuptor1 = new Cuptor("Entourage",20000,220,preparate);
        ACuptor cuptor2 = cuptor1.clone(200);
        ACuptor cuptor3 = cuptor2.clone(180);
        ACuptor cuptor4 = cuptor1.clone(200);
        ACuptor cuptor5 = cuptor1.clone(200);
        System.out.println(cuptor1);
        System.out.println(cuptor2);
    }
}
