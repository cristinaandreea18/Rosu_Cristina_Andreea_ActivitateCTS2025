package ro.cts.main;

import ro.cts.clase.Factura;
import ro.cts.decorator.Decorator;
import ro.cts.decorator.FacturaDecorata;

public class Main {
    public static void main(String[] args){
        Factura factura = new Factura(12345,2000);
        factura.printareFactura();

        Decorator facturaDecorata = new FacturaDecorata(factura);
        facturaDecorata.aplicaDiscount(10);
        facturaDecorata.printareFactura();
    }
}
