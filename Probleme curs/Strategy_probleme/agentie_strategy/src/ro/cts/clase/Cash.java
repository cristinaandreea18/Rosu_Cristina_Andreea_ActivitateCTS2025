package ro.cts.clase;

public class Cash implements ModPlata {
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+" a platit cash suma de "+suma);
    }
}
