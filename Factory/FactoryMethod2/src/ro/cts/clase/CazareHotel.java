package ro.cts.clase;

public class CazareHotel implements PachetTuristic {
    private float pret;
    private int nrLocOcupat;
    @Override
    public void descriere() {
        System.out.println("Acest pachet turistic achiziotionat la pretul de "+pret +" corespunde unei cazari la hotel la camera cu nr. "+nrLocOcupat);
    }

    public CazareHotel(float pret, int nrLocOcupat) {
        this.pret = pret;
        this.nrLocOcupat = nrLocOcupat;
    }
}
