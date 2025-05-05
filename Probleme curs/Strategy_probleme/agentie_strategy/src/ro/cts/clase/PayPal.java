package ro.cts.clase;

public class PayPal implements ModPlata {
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+" a platit prin paypal suma de "+suma);
    }
}
