package ro.cts.mode.personal;

public class Profesor extends Persoana implements IPredabil {
    private int id;
    private float salariul;
    private float sporVechime;

    public Profesor(String nume, int varsta,int id,float salariul,float sporVechime ) {
        super(nume, varsta);
        this.id= id;
        this.salariul = salariul;
        this.sporVechime= sporVechime;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesorul ").append(this.nume).append(" preda la curs");
        System.out.println(sb.toString());
    }

    @Override
    public float calculareVenit() {
        return salariul+(salariul*sporVechime);
    }
}
