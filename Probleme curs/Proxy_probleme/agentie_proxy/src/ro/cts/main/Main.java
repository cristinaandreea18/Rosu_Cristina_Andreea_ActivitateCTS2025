package ro.cts.main;

import ro.cts.clase.PachetTransport;
import ro.cts.clase.PachetTuristic;
import ro.cts.clase.Persoana;
import ro.cts.clase.ProxyPachet;

public class Main {
    public static void main(String[] args){
        Persoana persoana = new Persoana("Ion",35);
        PachetTuristic pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        PachetTuristic pachetTransportProxy = new ProxyPachet(persoana);
        pachetTransportProxy.rezervaPachet();
    }
}
