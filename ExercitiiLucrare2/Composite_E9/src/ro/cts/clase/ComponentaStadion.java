package ro.cts.clase;

public interface ComponentaStadion {
    void adaugaComponentaStadion(ComponentaStadion componentaDeAdugat) throws Exception;
    void stergeComponentaStadion(ComponentaStadion componentaDeSters) throws Exception;
    void getComponentaStadion(int cheie) throws Exception;
    void afiseazaComponentaStadion();
}
