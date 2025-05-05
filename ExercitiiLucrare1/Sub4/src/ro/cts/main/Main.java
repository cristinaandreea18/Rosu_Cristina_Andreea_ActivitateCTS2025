package ro.cts.main;

import ro.cts.clase.ARaport;
import ro.cts.clase.Senzor;
import ro.cts.clase.SenzorBuilder;
import ro.cts.clase.factory.FabricaRaportCalitateAer;

public class Main {
    public static void main(String[]args){
        FabricaRaportCalitateAer fabricaRaportCalitateAer = new FabricaRaportCalitateAer();
        ARaport raport1 = fabricaRaportCalitateAer.getRaport(35,18,"11.03.2025");
        ARaport raport2 = fabricaRaportCalitateAer.getRaport(71,11,"17.02.2025");
        ARaport raport3 = fabricaRaportCalitateAer.getRaport(25,9,"18.04.2025");

        raport1.prezintaSituatie();
        raport2.prezintaSituatie();
        raport3.prezintaSituatie();


        SenzorBuilder builder = new SenzorBuilder();
        Senzor senzor1 = builder.setHasIndiceUmiditate(true).setHasC0(true).setHasPM2_5(true).seHasPM10(true).build("Craiova");
        Senzor senzor2 = builder.seHasPM10(true).setHasPM2_5(true).setHasVOC(true).setHasMasurareTemperatura(true).build("Bucuresti");

        senzor1.prezintaSituatie();
        System.out.println(senzor1);
        senzor2.prezintaSituatie();
        System.out.println(senzor2);
    }
}
