package ro.cts.main;

import ro.cts.clase.CazareCabana;
import ro.cts.clase.PachetTuristic;
import ro.cts.fabrici.CAZARE;
import ro.cts.fabrici.FabricaPtCazare;
import ro.cts.fabrici.FabricaPtTransport;
import ro.cts.fabrici.TRANSPORT;

public class Main {
    public static void main(String[]args){
        FabricaPtTransport fabricaTransport = new FabricaPtTransport(180);
        FabricaPtCazare fabricaPtCazare = new FabricaPtCazare("Brasov");

        PachetTuristic cazareCabana = fabricaPtCazare.crearePachetTuristic(CAZARE.CABANA,250,9);
        PachetTuristic cazareHotel = fabricaPtCazare.crearePachetTuristic(CAZARE.HOTEL,300,15);

        PachetTuristic transportAutocar = fabricaTransport.crearePachetTuristic(TRANSPORT.AUTOCAR,85,24);
        PachetTuristic transportMicrobuz = fabricaTransport.crearePachetTuristic(TRANSPORT.MICROBUZ,80,10);

        cazareCabana.descriere();
        cazareHotel.descriere();
        transportAutocar.descriere();
        transportMicrobuz.descriere();
    }
}
