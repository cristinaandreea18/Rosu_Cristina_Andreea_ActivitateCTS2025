package ro.cts.mode.personal;

public class Asistent extends Persoana implements IPredabil {
  private int id;
  private float salariul;

    public Asistent(String nume, int varsta, int id, float salariul) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariul;
    }

    public int getId() {
        return id;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistentul ").append(this.nume).append(" preda la seminar");
        System.out.println(sb.toString());
    }

    @Override
    public float calculareVenit() {
        return 0;
    }
}
