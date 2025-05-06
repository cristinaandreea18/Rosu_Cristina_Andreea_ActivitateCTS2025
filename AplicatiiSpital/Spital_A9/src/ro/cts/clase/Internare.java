package ro.cts.clase;

public class Internare implements IInternare {
    private Persoana pacient;

    public Internare(Persoana pacient) {
        this.pacient = pacient;
    }

    public Persoana getPacient() {
        return pacient;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul cu numele "+pacient.getNume()+" a fost internat avand asigurare medicala");
    }
}
