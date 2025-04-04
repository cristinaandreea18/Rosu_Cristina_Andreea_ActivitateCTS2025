package ro.cts.clase;

public class PachetCazare implements PachetTuristic {
    private float pret;
    private int nrZileOferta;;

    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet turistic ce contine cazare pe un nr de zile "+nrZileOferta+" la pretul de "+pret);
    }

    public PachetCazare(float pret,int nrZileOferta) {
        this.pret = pret;
        this.nrZileOferta = nrZileOferta;
    }
}
