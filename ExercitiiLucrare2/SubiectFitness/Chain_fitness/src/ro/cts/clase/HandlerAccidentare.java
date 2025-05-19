package ro.cts.clase;

public abstract class HandlerAccidentare {
    HandlerAccidentare handler;

    public void setHandler(HandlerAccidentare handler) {
        this.handler = handler;
    }

    public HandlerAccidentare getHandler() {
        return handler;
    }

    public abstract void gestionareAccidentare(FisaAccident fisa);
}
