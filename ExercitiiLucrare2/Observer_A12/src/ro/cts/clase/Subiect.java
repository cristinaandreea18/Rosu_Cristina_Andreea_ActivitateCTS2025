package ro.cts.clase;

public interface Subiect {
    void adaugaObserver(Observer observerDeAdaugat);
    void stergeObserver(Observer observatorDeSters);
    void notifica(String mesaj);
}
