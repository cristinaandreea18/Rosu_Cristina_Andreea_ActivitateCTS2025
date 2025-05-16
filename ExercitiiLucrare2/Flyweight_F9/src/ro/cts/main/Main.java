package ro.cts.main;

import ro.cts.clase.AbstractLinie;
import ro.cts.clase.Autobuz;
import ro.cts.clase.FabricaLinii;
import ro.cts.clase.Linie;

public class Main {
    public static void main(String[] args){
        FabricaLinii fabrica = new FabricaLinii();
        AbstractLinie linie2 = new Linie(178,"Sala Palatului","Complex Apusului");

        Autobuz autobuz1 = new Autobuz("Mercedes",2015,30);
        Autobuz autobuz2 = new Autobuz("Mercedes",2014,29);

        linie2.circula(autobuz1);
        linie2.circula(autobuz2);

        fabrica.getLinie(105,"Soseaua Nicolae Titulescu","Valea Oltului").circula(autobuz1);
        fabrica.getLinie(105,"Soseaua Nicolae Titulescu","Valea Oltului").circula(autobuz2);
    }
}
