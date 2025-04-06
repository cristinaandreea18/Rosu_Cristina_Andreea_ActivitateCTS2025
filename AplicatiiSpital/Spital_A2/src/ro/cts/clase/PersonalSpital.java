package ro.cts.clase;

public abstract class PersonalSpital {
    private String numeSpital;
    private String nume;
    private float salariu;
    private int vechime;

    public PersonalSpital(String numeSpital,String nume, float salariu, int vechime) {
        this.numeSpital = numeSpital;
        this.nume = nume;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public void setNumeSpital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numeSpital='").append(numeSpital).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    public abstract void descrie();
}
