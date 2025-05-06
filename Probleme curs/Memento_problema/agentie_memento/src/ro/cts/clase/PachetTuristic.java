package ro.cts.clase;

public class PachetTuristic {
    private double pret;
    private String numePachet;

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public PachetTuristic(double pret) {
        this.pret = pret;
        this.numePachet="nume";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("pret=").append(pret);
        sb.append(", numePachet='").append(numePachet).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public MementoPachetTuristic salvareMemento(){
        return new MementoPachetTuristic(pret);
    }

    public void undoToMemento(MementoPachetTuristic memento){
        this.pret=memento.getPretPachet();
    }
}
