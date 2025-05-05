package ro.cts.decorator;

import ro.cts.clase.Factura;
import ro.cts.clase.IFactura;

public abstract class Decorator implements IFactura {

    protected Factura factura;

    public Decorator(Factura factura) {
        this.factura = factura;
    }

    @Override
    public void printareFactura() {
        factura.printareFactura();
        System.out.println("La multi ani!");
    }

    public abstract void aplicaDiscount(int procent);
}
