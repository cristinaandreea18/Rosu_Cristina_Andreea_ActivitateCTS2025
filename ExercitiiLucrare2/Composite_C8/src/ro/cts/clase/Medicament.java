package ro.cts.clase;

public class Medicament implements Categorie {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void adaugaCategorie(Categorie categorieDeAdaugat) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeCategorie(Categorie categorieDeSters) throws Exception {
        throw new Exception("Nu este implementata");

    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicament "+numeMedicament);
    }

    @Override
    public Categorie getCategorie(int cheie) throws Exception {
        throw new Exception("Nu este implementata");
    }
}
