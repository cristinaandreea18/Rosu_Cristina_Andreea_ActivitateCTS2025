package ro.cts.clase;

public class CazareCabana implements PachetTuristic {
    private float pret;
    private int nrLocOcupat;
    @Override
    public void descriere() {
        System.out.println("Acest pachet turistic achiziotionat la pretul de "+pret +" corespunde unei cazari la cabana la camera cu nr. "+nrLocOcupat);
    }

    public CazareCabana(float pret, int nrLocOcupat) {
        this.pret = pret;
        this.nrLocOcupat = nrLocOcupat;
    }
}
