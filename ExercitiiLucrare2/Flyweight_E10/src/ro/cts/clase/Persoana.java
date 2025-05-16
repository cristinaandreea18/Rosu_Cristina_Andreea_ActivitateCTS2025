package ro.cts.clase;

public class Persoana implements AbstractPersoana {
    private int latime;
    private int inaltime;

    public Persoana(int inaltime, int latime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void deseneaza(LocTribuna loc) {
        System.out.println("A fost desenata persoana "+this.toString()+ " care se caracteriza prin "+loc);
    }
}
