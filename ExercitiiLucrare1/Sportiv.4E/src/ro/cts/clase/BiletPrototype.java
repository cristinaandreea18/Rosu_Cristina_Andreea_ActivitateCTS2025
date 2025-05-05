package ro.cts.clase;

public class BiletPrototype extends AbstractBilet {
    private String numeEveniment;
    private float pret;
    private String data;

    public BiletPrototype(){
        super();
    }
    public BiletPrototype(String eveniment,float pret, String data ,String nume, String email, String nrTelefon, String domiciliu) {
        super(nume, email, nrTelefon, domiciliu);
        this.numeEveniment = eveniment;
        this.pret = pret;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletPrototype{");
        sb.append("numeEveniment='").append(numeEveniment).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", data='").append(data).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", domiciliu='").append(domiciliu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractBilet clone(String numeEveniment, float pret, String data) {
        BiletPrototype bilet = new BiletPrototype();
        bilet.nume = this.nume;
        bilet.email = this.email;
        bilet.nrTelefon = this.nrTelefon;
        bilet.domiciliu = this.domiciliu;
        bilet.numeEveniment = numeEveniment;
        bilet.pret = pret;
        bilet.data = data;
        return bilet;
    }
}
