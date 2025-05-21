package ro.cts.main;

import ro.cts.clase.ComponentaStadion;
import ro.cts.clase.Loc;
import ro.cts.clase.Sectiune;
import ro.cts.clase.SubSectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        ComponentaStadion componentaTribuna = new Sectiune("Tribuna");
        ComponentaStadion tribunaNord = new SubSectiune("Tribuna Nord");
        ComponentaStadion tribunaSud = new SubSectiune("Tribuna Sud");
        ComponentaStadion tribunaCopii = new SubSectiune("Tribuna Copii");
        ComponentaStadion tribunaVIP = new SubSectiune("Tribuna VIP");

        try {
            ComponentaStadion loc1 = new Loc(11);
            ComponentaStadion loc2 = new Loc(22);

            componentaTribuna.adaugaComponentaStadion(tribunaNord);
            componentaTribuna.adaugaComponentaStadion(tribunaSud);
            componentaTribuna.adaugaComponentaStadion(tribunaCopii);
            componentaTribuna.adaugaComponentaStadion(tribunaVIP);

            tribunaCopii.adaugaComponentaStadion(loc1);
            tribunaCopii.adaugaComponentaStadion(loc2);

            componentaTribuna.afiseazaComponentaStadion();
        }
        catch(Exception ex){
            throw  new RuntimeException(ex);
        }
    }
}
