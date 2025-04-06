package ro.cts.clase;

public class Brancardier extends PersonalSpital {
    private int vechime;
    public Brancardier(int vechime,String nume, float salariu) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Brancardier{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul cu numele "+nume+" are un salariu de "+salariu +" si o vechime de "+vechime);
    }
}
