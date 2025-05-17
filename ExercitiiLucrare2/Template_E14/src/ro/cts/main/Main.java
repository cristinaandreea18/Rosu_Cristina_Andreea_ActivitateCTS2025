package ro.cts.main;

import ro.cts.clase.Bilet;
import ro.cts.clase.IntrareStandard;
import ro.cts.clase.IntrareVIP;
import ro.cts.clase.TemplateIntrareStadion;

public class Main {
    public static void main(String[] args){
        Bilet bilet = new Bilet("Alin",75, 230);
        TemplateIntrareStadion intrareStandard = new IntrareStandard();
        intrareStandard.accesStadion(bilet);
        System.out.println("--------------");

        bilet.setVIP(true);
        bilet.setCodAcces("X1X2X3X4");
        TemplateIntrareStadion intrareVIP = new IntrareVIP();
        intrareVIP.accesStadion(bilet);
    }
}
