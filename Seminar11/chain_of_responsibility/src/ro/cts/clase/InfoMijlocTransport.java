package ro.cts.clase;

public abstract class InfoMijlocTransport {
    InfoMijlocTransport mijlocTransport;

    public void setMijlocTransport(InfoMijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    public InfoMijlocTransport getMijlocTransport() {
        return mijlocTransport;
    }

    public abstract void recomandaTransport(int distanta);

}
