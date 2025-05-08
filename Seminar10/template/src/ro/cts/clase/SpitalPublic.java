package ro.cts.clase;

public class SpitalPublic extends TemplateInternare {
    private String denumire;

    public SpitalPublic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    public void verificareDisponibilitate() {
        System.out.println("Nu avem paturi disponibile in spitalul "+this.denumire);
    }

    @Override
    public void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" a fost transferat la alt spital!");
    }
}
