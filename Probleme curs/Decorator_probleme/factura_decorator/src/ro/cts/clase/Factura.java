package ro.cts.clase;

public class Factura implements IFactura {
    private int codFactura;
    private double sumaFactura;

    public Factura(int codFactura, double sumaFactura) {
        this.codFactura = codFactura;
        this.sumaFactura = sumaFactura;
    }

    @Override
    public void printareFactura() {
        System.out.println("A fost printata factura avand codul "+codFactura+" si suma de "+sumaFactura);
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public double getSumaFactura() {
        return sumaFactura;
    }

    public void setSumaFactura(double sumaFactura) {
        this.sumaFactura = sumaFactura;
    }
}
