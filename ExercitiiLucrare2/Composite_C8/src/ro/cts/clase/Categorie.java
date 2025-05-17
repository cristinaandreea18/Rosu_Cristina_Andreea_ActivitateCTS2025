package ro.cts.clase;

public interface Categorie {
    void adaugaCategorie(Categorie categorieDeAdaugat) throws Exception;
    void stergeCategorie(Categorie categorieDeSters) throws Exception;
    void afiseazaDescriere() throws Exception;
    Categorie getCategorie(int cheie) throws Exception;
}
