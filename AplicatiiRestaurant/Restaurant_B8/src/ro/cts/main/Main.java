package ro.cts.main;

import ro.cts.clase.ItemsMeniu;
import ro.cts.clase.SectiuneMeniu;
import ro.cts.clase.SectiuneRestaurant;
import ro.cts.clase.SubSectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        SectiuneMeniu sectiuneMeniu1 = new SectiuneRestaurant("Meniu principal");
        SectiuneMeniu sectiuneMeniu2 = new SectiuneRestaurant("Mancaruri");

        SectiuneMeniu aperitive = new SubSectiune("Aperitive");
        SectiuneMeniu ciorbe = new SubSectiune("Ciorbe");


        SectiuneMeniu bruschete = new ItemsMeniu("bruschete");
        SectiuneMeniu perisoare = new ItemsMeniu("Ciorna de perisoare");
        SectiuneMeniu legume = new ItemsMeniu("Legume");

        sectiuneMeniu1.adaugaSectiune(aperitive);
        aperitive.adaugaSectiune(bruschete);

        sectiuneMeniu2.adaugaSectiune(ciorbe);
        ciorbe.adaugaSectiune(perisoare);
        ciorbe.adaugaSectiune(legume);

        sectiuneMeniu1.afiseazaSectiune("");
        sectiuneMeniu2.afiseazaSectiune("");
    }
}
