package ro.cts.clase;

public interface AbstractFactory {
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, float pret,float calorii);
}
