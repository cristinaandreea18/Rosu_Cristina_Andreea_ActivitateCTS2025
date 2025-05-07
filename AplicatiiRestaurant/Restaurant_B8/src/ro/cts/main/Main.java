package ro.cts.main;

import ro.cts.clase.ItemsMeniu;
import ro.cts.clase.SectiuneMeniu;
import ro.cts.clase.SectiuneRestaurant;
import ro.cts.clase.SubSectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        SectiuneMeniu meniuPrincipal = new SectiuneRestaurant("Meniu principal");

        SectiuneMeniu mancaruri = new SectiuneRestaurant("Mâncăruri");
        SectiuneMeniu bauturi = new SectiuneRestaurant("Băuturi");
        SectiuneMeniu deserturi = new SectiuneRestaurant("Deserturi");

        SectiuneMeniu aperitive = new SubSectiune("Aperitive");
        SectiuneMeniu ciorbe = new SubSectiune("Ciorbe");
        SectiuneMeniu felPrincipal = new SubSectiune("Fel Principal");

        SectiuneMeniu sucuri = new SubSectiune("Sucuri");
        SectiuneMeniu cafea = new SubSectiune("Cafea");

        SectiuneMeniu bruschete = new ItemsMeniu("Bruschete");
        SectiuneMeniu ciorbaPerisoare = new ItemsMeniu("Ciorbă de perișoare");
        SectiuneMeniu snitel = new ItemsMeniu("Șnițel cu cartofi");
        SectiuneMeniu apa = new ItemsMeniu("Apă plată");
        SectiuneMeniu cola = new ItemsMeniu("Cola");
        SectiuneMeniu espresso = new ItemsMeniu("Espresso");
        SectiuneMeniu cheesecake = new ItemsMeniu("Cheesecake");

        aperitive.adaugaSectiune(bruschete);
        ciorbe.adaugaSectiune(ciorbaPerisoare);
        felPrincipal.adaugaSectiune(snitel);

        sucuri.adaugaSectiune(apa);
        sucuri.adaugaSectiune(cola);
        cafea.adaugaSectiune(espresso);

        deserturi.adaugaSectiune(cheesecake);

        mancaruri.adaugaSectiune(aperitive);
        mancaruri.adaugaSectiune(ciorbe);
        mancaruri.adaugaSectiune(felPrincipal);

        bauturi.adaugaSectiune(sucuri);
        bauturi.adaugaSectiune(cafea);

        meniuPrincipal.adaugaSectiune(mancaruri);
        meniuPrincipal.adaugaSectiune(bauturi);
        meniuPrincipal.adaugaSectiune(deserturi);

        mancaruri.stergeSectiune(ciorbe);
        meniuPrincipal.afiseazaSectiune("");
    }
}
