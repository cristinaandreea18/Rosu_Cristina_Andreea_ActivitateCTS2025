package ro.cts.clase;

public class TransportAutocar implements PachetTuristic {
private int nrLocOcupat;
private float pret;

    @Override
    public void descriere() {

        System.out.println("Acest pachet turistic achiziotionat la pretul de "+pret +" are asociat transport cu autocarul corespunzatorul locului cu nr. "+nrLocOcupat);
    }

    public TransportAutocar(float pret, int nrLocOcupat) {
        this.nrLocOcupat = nrLocOcupat;
        this.pret = pret;
    }
}
