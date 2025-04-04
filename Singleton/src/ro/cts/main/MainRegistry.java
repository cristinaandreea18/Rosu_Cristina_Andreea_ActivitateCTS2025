package ro.cts.main;

import ro.cts.registry.*;

public class MainRegistry {
    public static void main(String[]args){
        RegistryPachete registryPachete = RegistryPachete.getInstance();
        PachetTuristic cazare = registryPachete.inregistreazaPachet("cazare", new PachetCazare());
        PachetTuristic transport = registryPachete.inregistreazaPachet("transport",new PachetTransport());
        PachetTuristic pachetCazareTransport = registryPachete.inregistreazaPachet("cazare si transport",new PachetCazareTransport());

        cazare.descriere();
        transport.descriere();
        pachetCazareTransport.descriere();
    }
}
