package ro.cts.clase;

public class StarePlatita implements Stare {
    @Override
    public void doAction(Rezervare rezervare) {
        System.out.println("Rezervarea cu id-ul "+rezervare.getId()+" a trecut in starea platita");
    }
}
