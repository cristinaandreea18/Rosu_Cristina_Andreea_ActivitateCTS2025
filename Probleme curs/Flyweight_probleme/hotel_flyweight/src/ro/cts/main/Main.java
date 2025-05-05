package ro.cts.main;

import ro.cts.clase.FabricaDeCamere;
import ro.cts.clase.ICamera;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        Rezervare rezervare1 = new Rezervare("Ion",15);
        Rezervare rezervare2 = new Rezervare("Marin",11);

        Rezervare rezervare3 = new Rezervare("Dorel",23);

        FabricaDeCamere fabricaDeCamere = new FabricaDeCamere();
        ICamera camera = fabricaDeCamere.getCamera(1);
        camera.tiparire(rezervare2);
        fabricaDeCamere.getCamera(2).tiparire(rezervare1);
        fabricaDeCamere.getCamera(1).tiparire(rezervare3);

    }
}
