package ro.cts.clase;

public class Registrator extends PersonalSpital {
    private int oreProgram;
    public Registrator(int oreProgram,String nume, float salariu) {
        super(nume, salariu);
        this.oreProgram = oreProgram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Registrator{");
        sb.append("oreProgram=").append(oreProgram);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Registratorul cu numele "+nume+" are un salariu de "+salariu +" si "+ oreProgram+" ore de program");
    }
}
