package ro.cts.clase;

public class Rezervare implements IRezervare {
    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        System.out.println(numeClient + " are o rezervare pentru " + nrPersoane + " persoane, la ora " + ora);
    }
}
