package ro.cts.mode.platforma;

import ro.cts.mode.personal.IPredabil;
import ro.cts.mode.personal.Persoana;
import ro.cts.mode.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
    public void sustineExamen(String data){
        StringBuilder sb = new StringBuilder();
        sb.append("Profesorul ").append(((Persoana)this.profesor).getNume()).append(" are examen la materia ").append(this.numeCurs).append(" cu urmatorii studenti:");
        System.out.println(sb.toString());
        for(Student student:this.studenti){
            System.out.println(student.getNume());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("la data de ").append(data);
        System.out.println(sb2.toString());
    }
}
