package ro.cts.main;

import ro.cts.clase.Factura;
import ro.cts.clase.FacturaBuilder;

public class Main {
    public static void main(String[]args){
        FacturaBuilder builder = new FacturaBuilder();
        Factura factura1 = builder.setNrFactura(131415).setHasCardFidelitate(true).setNrPungi(2).setCotaTVA(0.11).build("Ion");
        Factura factura2 = builder.setNrFactura(145678).build("Ilie");
        System.out.println(factura1);
        System.out.println(factura2);
    }
}
