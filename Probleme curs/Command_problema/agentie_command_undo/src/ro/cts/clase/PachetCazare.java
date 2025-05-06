package ro.cts.clase;

public class PachetCazare implements PachetTuristic {
    private int cod;

    public PachetCazare(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("Acest pachet de cazare cu numarul "+cod +" a fost vandut");
    }

    @Override
    public void rezervare() {
        System.out.println("Acest pachet de cazare cu numarul "+cod +" a fost rezervat");
    }

    @Override
    public void anulareVanzare() {
        System.out.println("Vanzarea acestui pachet de cazare cu numarul "+cod +" a fost anulata");
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea acestui pachet de cazare cu numarul "+cod +" a fost anulata");
    }
}
