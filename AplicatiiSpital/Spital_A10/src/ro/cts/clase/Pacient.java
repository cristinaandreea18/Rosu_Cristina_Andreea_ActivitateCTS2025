package ro.cts.clase;

public class Pacient implements IPacient {
    private String numePacient;
    private String telefon;
    private String adresa;
    private int varsta;

    public Pacient(String numePacient, String telefon, String adresa, int varsta) {
        this.numePacient = numePacient;
        this.telefon = telefon;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    @Override
    public void descriePacient(Spitalizare spitalizare) {
        System.out.println("Pacientul cu numele "+numePacient+" cu varsta de "+varsta+" s-a internat pentru "+spitalizare.getDiagnostic()+" pentru un numar de zile "+spitalizare.getNumarZileSpitalizare()+" la salonul "+spitalizare.getNumarSalon());
    }


}
