package cts.clase;

public class RezervareInterior extends AbstractRezervare {
    private boolean esteLaParter;
    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter= esteLaParter;
    }
    public RezervareInterior (){
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }


    public AbstractRezervare copiaza(int ziua){
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.esteLaParter = this.esteLaParter;
        rezervare.ziuaLunii = ziua;
        rezervare.ora = this.ora;
        rezervare.numeClient = this.numeClient;
        rezervare.nrParticipanti = this.nrParticipanti;

        return rezervare;
    }
}
