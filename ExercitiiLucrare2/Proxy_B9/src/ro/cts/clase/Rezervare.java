package ro.cts.clase;

public class Rezervare implements IRezervare {

    @Override
    public void rezerva(Persoana persoana) {
        System.out.println("Persoana cu numele "+persoana.getNume()
                +" a facut o rezervare pentru un numar de "+ persoana.getNumarPersoane()
                +" persoane la ora "+persoana.getOraRezervare());

    }
}
