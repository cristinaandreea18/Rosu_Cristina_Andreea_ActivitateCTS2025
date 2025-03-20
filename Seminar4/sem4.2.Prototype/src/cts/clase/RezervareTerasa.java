package cts.clase;

public class RezervareTerasa extends AbstractRezervare {
private boolean esteFumator;

    public RezervareTerasa(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    public RezervareTerasa(){
        super();
    }

    public AbstractRezervare copiaza(int ziua){
        RezervareTerasa rezervare = new RezervareTerasa();
        rezervare.esteFumator = this.esteFumator;
        rezervare.nrParticipanti = nrParticipanti;
        rezervare.numeClient= this.numeClient;
        rezervare.ora= this.ora;
        rezervare.ziuaLunii = ziua;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTerasa{");
        sb.append("esteFumator=").append(esteFumator);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
