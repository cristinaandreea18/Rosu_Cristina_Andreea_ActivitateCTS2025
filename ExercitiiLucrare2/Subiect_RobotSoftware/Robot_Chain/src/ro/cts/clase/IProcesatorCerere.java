package ro.cts.clase;

public interface IProcesatorCerere {
    void setNext(IProcesatorCerere next);
    void proceseaza(Cerere cerere);
}
