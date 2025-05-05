package ro.cts.clase;

public class PachetTuristic implements IPachetTuristic {
    private int codPachet;
    private String numeHotel;
    private String destinatie;
    private boolean micDejun;


    public PachetTuristic(int codPachet, String numeHotel, String destinatie, boolean micDejun) {
        super();
        this.codPachet = codPachet;
        this.numeHotel = numeHotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    public int getCodPachet() {
        return codPachet;
    }

    public void setCodPachet(int codPachet) {
        this.codPachet = codPachet;
    }

    public String getNumeHotel() {
        return numeHotel;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("codPachet=").append(codPachet);
        sb.append(", numeHotel='").append(numeHotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrierePachet(Optionale optionale) {
        System.out.println("Pachetul turistic cu codul "+codPachet+
                " are cazare la hotelul "+numeHotel+" cu destinatia "+destinatie+
                " mic dejun "+(optionale.isCina() ? " are " : " nu are ")+
                " inclusa cina si are un numar de "
                + optionale.getNumarExcursii() + " excursii optionale");
    }
}

