package ro.cts.clase;

public abstract class HandlerComanda {
   protected HandlerComanda urmatorul;

    public void setUrmatorul(HandlerComanda urmatorul) {
        this.urmatorul = urmatorul;
    }
    public abstract void trimiteComanda(String medicamente);
}
