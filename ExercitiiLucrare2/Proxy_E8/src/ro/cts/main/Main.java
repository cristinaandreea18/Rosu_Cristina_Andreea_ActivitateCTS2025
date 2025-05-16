package ro.cts.main;

import ro.cts.clase.IBilet;
import ro.cts.clase.ProxyBilet;
import ro.cts.clase.VanzareBilet;

public class Main {
    public static void main(String[] args){
        IBilet bilet = new VanzareBilet();
        ProxyBilet proxy = new ProxyBilet(bilet);
        proxy.vindeBilet("Ana",75,13);
        proxy.vindeBilet("Rares",75,21);
    }
}
