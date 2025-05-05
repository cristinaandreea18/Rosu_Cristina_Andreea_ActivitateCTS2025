package ro.cts.clase;

public class PachetTransport implements PachetTuristic {
    Persoana persoana;

    public Persoana getPersoana(){
        return persoana;
    }

    public void setPersoana(Persoana persoana){
        this.persoana = persoana;
    }

    public PachetTransport(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar transport");
    }

    @Override
    public void rezervaPachet() {
        System.out.println(persoana.getNume()+" a rezervat un pachet de transport");
    }
}
