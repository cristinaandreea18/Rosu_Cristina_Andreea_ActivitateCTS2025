package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect {
    private String numeRestaurant;
    private List<Observer>listaObserveri;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.listaObserveri = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observerDeAdaugat) {
        listaObserveri.add(observerDeAdaugat);
    }

    @Override
    public void stergeObserver(Observer observerDeSters) {
        listaObserveri.remove(observerDeSters);
    }

    @Override
    public void notificare(String mesaj) {
        for(Observer observer:listaObserveri){
            observer.primesteNotificare(mesaj);
        }
    }

    public void trimiteOferta(String produs,float pret){
        String mesaj = "Avem o oferta inegalabila pentru produsul "+produs+ " la pretul de "+pret;
        notificare(mesaj);
    }
}
