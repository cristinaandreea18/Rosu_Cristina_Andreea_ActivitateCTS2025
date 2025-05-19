package ro.cts.clase;

public class ClipCuReclame extends ClipDecorat {
    private int minutInceput;
    private int durataTransmisie;

    public ClipCuReclame(ClipVideo video, int minutInceput, int durataTransmisie) {
        super(video);
        this.minutInceput = minutInceput;
        this.durataTransmisie = durataTransmisie;
    }

    @Override
    protected void redareCuReclama() {
        System.out.println("Reclama a inceput la minutul "+minutInceput +" si are o durata de "+durataTransmisie);
    }
}
