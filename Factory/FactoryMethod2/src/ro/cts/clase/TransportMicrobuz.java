package ro.cts.clase;

public class TransportMicrobuz implements  PachetTuristic {
    private int nrLocOcupat;
    private float pret;
    @Override
    public void descriere() {
        System.out.println("Acest pachet turistic achizitionat la pretul de "+pret +" are asociat transport cu microbuzul corespunzator locului cu nr. "+nrLocOcupat);
    }

    public TransportMicrobuz(float pret, int nrLocOcupat) {
        this.nrLocOcupat = nrLocOcupat;
        this.pret = pret;
    }
}
