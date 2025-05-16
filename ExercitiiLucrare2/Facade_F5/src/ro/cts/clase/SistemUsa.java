package ro.cts.clase;

public class SistemUsa {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public SistemUsa() {
        this.usaFata = new Usa("fata");
        this.usaMijloc = new Usa("mijloc");
        this.usaSpate = new Usa("spate");
    }

    public Usa getUsaFata() {
        return usaFata;
    }

    public Usa getUsaMijloc() {
        return usaMijloc;
    }

    public Usa getUsaSpate() {
        return usaSpate;
    }
}
