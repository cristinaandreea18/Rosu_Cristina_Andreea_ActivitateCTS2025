package ro.cts.main;

import ro.cts.clase.Categorie;
import ro.cts.clase.ItemMeniu;
import ro.cts.clase.OptiuneMeniu;

public class Main {
    public static void main(String[] args){
        OptiuneMeniu cFile = new Categorie("File");
        OptiuneMeniu cCamere = new Categorie("Camere");
        OptiuneMeniu cOferte = new Categorie("Oferte");

        OptiuneMeniu iOpen = new ItemMeniu("Open");
        OptiuneMeniu iSave = new ItemMeniu("Save");
        OptiuneMeniu iVizualizare = new ItemMeniu("Vizualizare camere");
        OptiuneMeniu iEditare = new ItemMeniu("Editare camere");
        OptiuneMeniu iOfertaCraciun = new ItemMeniu("Oferte Craciun");
        OptiuneMeniu iCreeazaOferta = new ItemMeniu("Creeaza oferta");

        try{
            cCamere.adaugaOptiune(iVizualizare);
            cCamere.adaugaOptiune(iEditare);

            cOferte.adaugaOptiune(iCreeazaOferta);
            cOferte.adaugaOptiune(iOfertaCraciun);

            cFile.adaugaOptiune(iOpen);
            cFile.adaugaOptiune(iSave);
            cFile.adaugaOptiune(cCamere);
            cFile.adaugaOptiune(cOferte);

            cFile.stergeOptiune(iSave);
            cOferte.stergeOptiune(iSave);

//            iOpen.stergeOptiune(iSave);

            cFile.descriere();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
