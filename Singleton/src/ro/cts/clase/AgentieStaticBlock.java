package ro.cts.clase;

public class AgentieStaticBlock {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static AgentieStaticBlock instanta;

    static {
        try{
            instanta = new AgentieStaticBlock("AAA",1000,5);
        }
        catch(Exception exception){
            System.out.println("Agentia nu poate fi creata");
        }
    }

    private AgentieStaticBlock(String numeAgentie, float capital, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
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

    public static AgentieStaticBlock getInstanta(){
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieStaticBlock{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
