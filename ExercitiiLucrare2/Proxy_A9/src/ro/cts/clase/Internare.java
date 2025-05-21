package ro.cts.clase;

public class Internare implements AbstractInternare {
    @Override
    public void internare(Pacient pacient) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacientul "+pacient.getNume());
        sb.append(" se poate interna "+pacient.getDurataSpitalizare() + " zile");
        System.out.println(sb);
    }
}
