package ro.cts.clase;

public interface IClip {
    void adaugaClip(IClip clipDeAdaugat) throws Exception;
    void stergeClip(IClip clipDeSters) throws Exception;
    void afiseazaDetalii();
    IClip getClipDinStructura(int cheie) throws Exception;
}
