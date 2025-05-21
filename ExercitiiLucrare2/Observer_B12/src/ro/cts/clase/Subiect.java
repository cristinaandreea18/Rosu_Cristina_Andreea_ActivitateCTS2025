package ro.cts.clase;

public interface Subiect {
    void adaugaObserver(Observer observerDeAdaugat);
    void stergeObserver(Observer observerDeSters);
    void notificare(String mesaj);
}
