package ro.cts.clase;

public abstract class HandlerTransport {
   private HandlerTransport urmatorul;

    public HandlerTransport getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(HandlerTransport urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomandaTransport(int distanta);

}
