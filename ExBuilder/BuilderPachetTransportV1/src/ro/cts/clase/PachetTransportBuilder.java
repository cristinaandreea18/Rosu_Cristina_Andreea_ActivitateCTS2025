package ro.cts.clase;

public class PachetTransportBuilder implements Builder {
    private PachetTransport pachetTransport;

    public PachetTransportBuilder(String nume){
        pachetTransport = new PachetTransport(nume,false,false,false,false,false);
    }

    public PachetTransportBuilder setHasWifi(boolean val){
        pachetTransport.setHasWifi(val);
        return this;
    }

    public PachetTransportBuilder setHasAnimale(boolean val){
        pachetTransport.setHasAnimale(val);
        return this;
    }

    public PachetTransportBuilder setIsFumator(boolean val){
        pachetTransport.setIsFumator(val);
        return this;
    }

    public PachetTransportBuilder setHasAc(boolean val){
        pachetTransport.setHasAC(val);
        return this;
    }

    public PachetTransportBuilder setHasTV(boolean val){
        pachetTransport.setHasTV(val);
        return this;
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }
}
