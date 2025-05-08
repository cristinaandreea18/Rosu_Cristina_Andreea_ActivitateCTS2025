package ro.cts.clase;

public class Pacient implements AbstractPacient{
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa) {
        super();
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString() + spitalizare.toString());
    }
}