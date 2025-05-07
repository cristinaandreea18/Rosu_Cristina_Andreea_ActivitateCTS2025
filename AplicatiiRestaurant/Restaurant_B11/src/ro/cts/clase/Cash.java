package ro.cts.clase;

public class Cash implements ModalitatePlata {
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+ " a platit cu cash suma de "+suma);
    }
}
