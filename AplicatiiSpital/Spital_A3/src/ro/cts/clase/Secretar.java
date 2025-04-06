package ro.cts.clase;

public class Secretar extends PersonalSpital {
    private int oreProgram;
    public Secretar(int oreProgram,String nume, float salariu) {
        super(nume, salariu);
        this.oreProgram = oreProgram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Secretar{");
        sb.append("oreProgram=").append(oreProgram);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Secretarul cu numele "+nume+" are un salariu de "+salariu +" si "+ oreProgram+" ore de program");
    }
}
