package ro.cts.clase;

public interface Subiect {
    void aboneaza(Observer observerAbonat);
    void dezaboneaza(Observer observerDezabonat);
    void notifica(String mesaj);
}
