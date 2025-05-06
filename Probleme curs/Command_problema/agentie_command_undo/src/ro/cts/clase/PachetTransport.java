package ro.cts.clase;

public class PachetTransport implements PachetTuristic {
    private int cod;

    public PachetTransport(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("Acest pachet de transport cu numarul "+cod +" a fost vandut");
    }

    @Override
    public void rezervare() {
        System.out.println("Acest pachet de transport cu numarul "+cod +" a fost rezervat");
    }

    @Override
    public void anulareVanzare() {
        System.out.println("Vanzarea acestui pachet de transport cu numarul "+cod +" a fost anulata");
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea acestui pachet de transport cu numarul "+cod +" a fost anulata");
    }
}
