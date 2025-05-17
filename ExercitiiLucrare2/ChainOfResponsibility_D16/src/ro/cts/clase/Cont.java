package ro.cts.clase;

public abstract class Cont {
    protected Cont urmatorul;
    protected float sold;

    public Cont(float sold) {
        this.sold = sold;
    }

    public void setUrmatorul(Cont urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void plateste(float suma);
}
