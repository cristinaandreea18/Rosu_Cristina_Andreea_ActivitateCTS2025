package ro.cts.main;

import ro.cts.clase.PachetTransport;
import ro.cts.clase.PachetTransportBuilder;

public class Main {
    public static void main(String[]args){
        PachetTransportBuilder builder = new PachetTransportBuilder("Viorica");
        PachetTransport pachetTransport = builder.setHasAc(true).setHasAnimale(true).setHasTV(true).build();
        System.out.println(pachetTransport);
    }
}
