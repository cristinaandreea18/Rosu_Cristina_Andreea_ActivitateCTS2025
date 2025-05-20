package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subiect {

    private List<Observer> colectieClienti;

    public Banca() {
        this.colectieClienti = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observerDeAdaugat) {
        colectieClienti.add(observerDeAdaugat);
    }

    @Override
    public void stergeObserver(Observer observerDeSters) {
        colectieClienti.remove(observerDeSters);
    }

    @Override
    public void notifica(String ofertaBanca) {
        for(Observer client:colectieClienti){
            client.receptionareMesaj(ofertaBanca);
        }
    }

    public void trimiteOferta(String tipOferta){
        String mesaj = " Banca trimite oferta de tipul "+tipOferta;
        notifica(mesaj);
    }
}
