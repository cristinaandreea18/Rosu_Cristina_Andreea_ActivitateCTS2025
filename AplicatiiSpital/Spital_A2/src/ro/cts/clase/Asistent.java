package ro.cts.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String numeSpital,String nume, float salariu, int vechime) {
        super(numeSpital, nume, salariu, vechime);
    }

    @Override
    public void descrie() {
        System.out.println("Asistentul cu numele "+ getNume()+" lucreaza la "+getNumeSpital()+ " de "+getVechime()+" si are un salariu de "+getSalariu());
    }
}
