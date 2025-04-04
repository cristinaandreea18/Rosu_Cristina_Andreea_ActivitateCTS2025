package ro.cts.clase;

public class AgentieThreadSafe {
    private String nume;
    private float capital;
    private int nrAngajati;

    private static AgentieThreadSafe instanta = null;

    private AgentieThreadSafe(String nume, float capital, int nrAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static synchronized AgentieThreadSafe getInstance(String nume,float capital,int nrAngajati){
        if(instanta==null){
            instanta = new AgentieThreadSafe(nume,capital,nrAngajati);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieThreadSafe{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
