package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SalaSport implements Subiect {
    private List<Observer> colectieAbonati;

    public SalaSport() {
        this.colectieAbonati = new ArrayList<Observer>();
    }

    @Override
    public void aboneaza(Observer observerAbonat) {
        colectieAbonati.add(observerAbonat);
    }

    @Override
    public void dezaboneaza(Observer observerDezabonat) {
        colectieAbonati.remove(observerDezabonat);
    }

    @Override
    public void notifica(String mesaj) {
        for(Observer clientAbonat:colectieAbonati){
            clientAbonat.primesteNotificare(mesaj);
        }
    }

    public void programareMeci(String sport){
        String mesaj = " A fost programat un meci de "+sport;
        notifica(mesaj);
    }
}
