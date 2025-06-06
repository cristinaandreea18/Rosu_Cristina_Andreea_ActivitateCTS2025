package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject {
    private int numarLinie;

    private List<Observer> calatori;

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatori = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        calatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer calator: calatori){
            calator.primesteMesaj(mesaj);
        }
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public abstract void pleacaDeLaCapat();
}
