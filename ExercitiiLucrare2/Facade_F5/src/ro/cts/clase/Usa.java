package ro.cts.clase;

public class Usa {
    private String nume;

    public Usa(String nume) {
        this.nume = nume;
    }

    public void deschidereLaSolicitare(){
        System.out.println( "Usa din "+nume+" a fost deschisa la solicitare calator");
    }
    public void deschidereFortata(){
        System.out.println("Usa din "+nume+ " a fost deschisa in mod fortat");
    }
}
