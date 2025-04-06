package ro.cts.clase;

public class Medic extends PersonalSpital {
    private int vechime;
    public Medic(int vechime,String nume, float salariu) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Medic{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Medicul cu numele "+nume+" are un salariu de "+salariu +" si o vechime de "+vechime);
    }
}
