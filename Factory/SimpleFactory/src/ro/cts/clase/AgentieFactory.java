package ro.cts.clase;

public class AgentieFactory {
 private int nrZileOferta;

    public AgentieFactory(int nrZileOferta) {
        this.nrZileOferta = nrZileOferta;
    }

    public PachetTuristic createInstance(TipPachet tip,float pret){
        switch (tip){
            case CAZARE -> {
                PachetCazare pachetCazare = new PachetCazare(pret,nrZileOferta);
                return pachetCazare;
            }
            case TRANSPORT -> {
                PachetTransport pachetTransport = new PachetTransport(pret,nrZileOferta);
                return pachetTransport;
            }
            case CAZARE_TRANSPORT -> {
                PachetCazareTransport pachetCazareTransport = new PachetCazareTransport(pret,nrZileOferta);
                return  pachetCazareTransport;
            }
            default -> {
                return null;
            }
        }
    }
}
