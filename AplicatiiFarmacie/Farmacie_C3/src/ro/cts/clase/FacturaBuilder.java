package ro.cts.clase;

public class FacturaBuilder implements Builder {

    public Factura factura;

    public FacturaBuilder(){
        factura = new Factura(12345,0,false,false,0);
    }

    public FacturaBuilder setNrFactura(int nrFactura) {
        factura.setNrFactura(nrFactura);
        return this;
    }

    public FacturaBuilder setNrPungi(int nrPungi) {
        factura.setNrPungi(nrPungi);
        return this;
    }

    public FacturaBuilder setHasPlataCuCard(boolean hasPlataCuCard) {
        factura.setHasPlataCuCard(hasPlataCuCard);
        return this;
    }

    public FacturaBuilder setHasCardFidelitate(boolean hasCardFidelitate) {
        factura.setHasCardFidelitate(hasCardFidelitate);
        return this;
    }

    public FacturaBuilder setCotaTVA(double cotaTVA) {
        factura.setCotaTVA(cotaTVA);
        return this;
    }

    @Override
    public Factura build(String detinator) {
        return factura;
    }
}
