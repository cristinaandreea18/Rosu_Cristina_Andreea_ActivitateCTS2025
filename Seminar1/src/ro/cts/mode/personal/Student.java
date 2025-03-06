package ro.cts.mode.personal;

public class Student extends Persoana {
    private int idStudent;
    private float bursa;

    public Student(String nume, int varsta,int idStudent,float bursa) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.bursa= bursa;
    }

    public void setBursa(float bursa) {
        this.bursa = bursa;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public float getBursa() {
        return bursa;
    }

    @Override
    public float calculareVenit() {
        return 0;
    }
}
