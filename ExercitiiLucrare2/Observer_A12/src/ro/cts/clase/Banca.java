package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subiect {
    private List<Observer> listaPacienti;

    public Banca() {
        this.listaPacienti =  new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observerDeAdaugat) {
        listaPacienti.add(observerDeAdaugat);
    }

    @Override
    public void stergeObserver(Observer observatorDeSters) {
        listaPacienti.remove(observatorDeSters);
    }

    @Override
    public void notifica(String mesaj) {
        for(Observer pacient:listaPacienti){
            pacient.primesteMesaj(mesaj);
        }
    }

    public void trimiteOferta(String urgenta){
        String mesaj = "A aparut un/o "+urgenta+ " in oras";
        notifica(mesaj);
    }
}
