package ro.cts.clase;


public abstract class AbstractBilet {
    protected String nume;
    protected String email;
    protected String nrTelefon;
    protected String domiciliu;

    public AbstractBilet(String nume, String email, String nrTelefon, String domiciliu) {
        try {
            Thread.sleep(3000);
            if(nume.length()>0) {
                this.nume = nume;
            }
            else {
                this.nume = "Anonim";
            }
            if(email.length()>0) {
                this.email = email;
            }
            else
            {
                this.email = "Necunoscut";
            }
            if(nrTelefon.length()==10){
                this.nrTelefon = nrTelefon;}
            else
            {
                throw new IllegalArgumentException("Format incorect");
            }
            if(domiciliu.length()>0) {
                this.domiciliu = domiciliu;
            }
            else {
                this.domiciliu = "Necunoscut";
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public AbstractBilet(){
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractBilet{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", domiciliu='").append(domiciliu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractBilet clone(String numeEveniment,float pret,String data);

}
