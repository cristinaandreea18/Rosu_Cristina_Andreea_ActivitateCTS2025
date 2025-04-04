package ro.cts.clase;

import java.io.Serializable;

public class AgentieSerialization implements Serializable {
    private String nume;
    private float capital;
    private int nrAngajati;
    private static AgentieSerialization instanta = null;

    private AgentieSerialization(String nume, float capital, int nrAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public static AgentieSerialization getInstance(String nume, float capital, int nrAngajati){
        if(instanta==null){
            instanta= new AgentieSerialization(nume,capital,nrAngajati);
        }
        return instanta;
    }
    protected Object readResolve(){
        return getInstance("xxx",0,0);
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieSerialization{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
