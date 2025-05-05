package ro.cts.main;

import ro.cts.clase.AutobuzLinie;
import ro.cts.clase.BuilderAutobuz;

public class Main {
    public static void main(String[]args){
        BuilderAutobuz builderAutobuz = BuilderAutobuz.getInstance("Bucuresti");
        builderAutobuz.descriere();
        AutobuzLinie autobuzLinie = builderAutobuz.setModel("Mercedes").setHasOpririCapatLinie(true).setNumeSofer("Ilie").setHasSolicitareDeschidereUsi(true).setHasTextEcranDerulant(true).build();
        System.out.println(autobuzLinie);

        BuilderAutobuz builderAutobuz2 = BuilderAutobuz.getInstance("Craiova");
        builderAutobuz2.descriere();
    }
}
