package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subiect {
    private List<Observer>colectieAbonati;

    public Farmacie() {
        this.colectieAbonati = new ArrayList<Observer>();
    }

    @Override
    public void aboneazaClient(Observer observerAbonat) {
        colectieAbonati.add(observerAbonat);

    }

    @Override
    public void dezaboneazaClient(Observer observerEliminat) {
        colectieAbonati.remove(observerEliminat);
    }

    @Override
    public void notifica(String oferta) {
        for(Observer clientAbonat:colectieAbonati){
            clientAbonat.primesteOferta(oferta);
        }
    }

    public void trimiteOferta(String medicament,float pret){
        String mesaj = "Medicamentul " +medicament+" se gaseste la pretul de "+pret;
        notifica(mesaj);
    }
}
