package ro.cts.main;

import ro.cts.clase.AgentieFactory;
import ro.cts.clase.PachetTuristic;
import ro.cts.clase.TipPachet;

public class Main {
    public static void main(String[]args){
        AgentieFactory agentieFactory = new AgentieFactory(7);
        PachetTuristic pachetTransport = agentieFactory.createInstance(TipPachet.TRANSPORT,500);
        PachetTuristic pachetCazare = agentieFactory.createInstance(TipPachet.CAZARE,1000);
        PachetTuristic pachetCazareTransport = agentieFactory.createInstance(TipPachet.CAZARE_TRANSPORT,1200);

        pachetTransport.descriere();
        pachetCazare.descriere();
        pachetCazareTransport.descriere();
    }
}
