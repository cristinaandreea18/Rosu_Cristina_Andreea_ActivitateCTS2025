package ro.cts.clase;

public class CompanieAeriana {
    private String numeCompanie;

    public CompanieAeriana(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana{");
        sb.append("numeCompanie='").append(numeCompanie).append('\'');
        sb.append('}');
        return sb.toString();
    }
     public Zbor rezervaBiletAvion(String plecare, String destinatie){
        Zbor zbor = new Zbor(this,plecare,destinatie);
        return zbor;
     }
}
