package ro.cts.clase;

public class ProxyRezervare implements IRezervare {
    IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(Persoana persoana) {
        if(persoana.getNumarPersoane()>=4){
            this.rezervare.rezerva(persoana);
        }
        else
            System.out.println("Va asteptam la restaurant!");
    }
}
