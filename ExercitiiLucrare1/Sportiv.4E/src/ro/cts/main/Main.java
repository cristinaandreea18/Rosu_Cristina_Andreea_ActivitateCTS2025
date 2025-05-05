package ro.cts.main;

import ro.cts.clase.AbstractBilet;
import ro.cts.clase.BiletPrototype;

public class Main {
    public static void main(String[] args){
        AbstractBilet bilet1 = new BiletPrototype("Romania vs Bosnia Hertegovina",90,"22.03.2025","Ion Popescu","ion.pop@gmail.com","0765642314","Constanta");
        AbstractBilet bilet2 = bilet1.clone("Austria vs Romania",75,"07.06.2025");

        System.out.println(bilet1);
        System.out.println(bilet2);
    }
}
