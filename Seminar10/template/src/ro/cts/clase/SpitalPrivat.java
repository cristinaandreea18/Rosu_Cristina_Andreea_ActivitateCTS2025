package ro.cts.clase;

public class SpitalPrivat extends TemplateInternare {
    @Override
    public int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    public void verificareDisponibilitate() {
        System.out.println("Avem paturi suficiente!");
    }

    @Override
    public void emitereFisa(Pacient pacient) {
        System.out.println("S-a emis fisa de internare pentru pacientul "+pacient.getNume());
    }
}
