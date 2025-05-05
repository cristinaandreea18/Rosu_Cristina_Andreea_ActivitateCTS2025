package ro.cts.main;

import ro.cts.clase.Facade;

public class Main {
    public static void main(String[] args){
        int codCamera = 9;
        Facade hotel = new Facade();
        System.out.println(hotel.verificareDisponibilitateCameraHotel(codCamera));

    }
}
