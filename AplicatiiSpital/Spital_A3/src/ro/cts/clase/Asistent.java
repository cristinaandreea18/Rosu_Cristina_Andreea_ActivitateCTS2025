package ro.cts.clase;

public class Asistent extends PersonalSpital {
    private int vechime;
    public Asistent(int vechime,String nume, float salariu) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Asistent{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul cu numele "+nume+" are un salariu de "+salariu +" si o vechime de "+vechime);
    }
}
