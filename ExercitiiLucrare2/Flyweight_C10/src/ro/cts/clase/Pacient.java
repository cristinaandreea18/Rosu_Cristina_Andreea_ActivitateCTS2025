package ro.cts.clase;

public class Pacient implements AbstractPacient {
    private String nume;
    private String numarAsigurare;

    public Pacient(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public void descriePacient(Reteta reteta) {
        System.out.println("Pacientul "+nume+ " cu numarul de asigurare "+numarAsigurare+
                " are reteta cu numarul "+reteta.getNumarReteta()+" cu "+ reteta.getNumarMedicamente()+ " numar medicamente "+
                " printre care se numara "+ reteta.getListaMedicamente()+ " la pretul de "+reteta.getSumaPlata());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarAsigurare='").append(numarAsigurare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
