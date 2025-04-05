package ro.cts.main;

import ro.cts.clase.BuilderPachetTransport;
import ro.cts.clase.PachetTransport;

public class Main {
    public static void main(String[]args){
        BuilderPachetTransport builder = new BuilderPachetTransport();
        PachetTransport pachetTransport = builder.setFumator(true).setHasAC(true).build("Ion");
        System.out.println(pachetTransport);
    }
}
