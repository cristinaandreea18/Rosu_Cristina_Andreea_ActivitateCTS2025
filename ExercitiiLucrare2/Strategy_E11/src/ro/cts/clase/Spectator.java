package ro.cts.clase;

public class Spectator {
    private String nume;
    private AbstractVerificareSpectator tipSpectator;

    public Spectator(String nume, AbstractVerificareSpectator tipSpectator) {
        this.nume = nume;
        this.tipSpectator = tipSpectator;
    }

    public Spectator(String nume) {
        this.nume = nume;
        this.tipSpectator = new Tribuna();
    }

    public void setTipSpectator(AbstractVerificareSpectator tipSpectator) {
        this.tipSpectator = tipSpectator;
    }

    public void verificareInFunctieDeLoc(){
        this.tipSpectator.verificaSpectator();
    }
}
