package ro.cts.clase;

public class PachetTransport implements PachetTuristic {
    private int cod;

    public PachetTransport(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("Acest pachet de transport cu codul "+cod+" a fost vandut");
    }

    @Override
    public void rezervare() {
        System.out.println("Acest pachet de transport cu codul "+cod+" a fost rezervat");
    }
}
