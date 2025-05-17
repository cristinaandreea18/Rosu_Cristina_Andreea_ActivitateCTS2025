package ro.cts.main;

import ro.cts.clase.Cont;
import ro.cts.clase.ContCredit;
import ro.cts.clase.ContCurent;
import ro.cts.clase.ContEconomii;

public class Main {
    public static void main(String[] args){
        Cont contCurent = new ContCurent(1000);
        Cont contEconomii = new ContEconomii(1500);
        Cont contCredit = new ContCredit(2000);

        contCurent.setUrmatorul(contEconomii);
        contEconomii.setUrmatorul(contCredit);
        contCredit.setUrmatorul(null);

        contCurent.plateste(200);
        contCurent.plateste(1100);
        contCurent.plateste(500);
        contCurent.plateste(400);
    }
}
