package ro.cts.clase;

public interface Subiect {
    void aboneazaClient(Observer observerAbonat);
    void dezaboneazaClient(Observer observerEliminat);
    void notifica(String oferta);
}
