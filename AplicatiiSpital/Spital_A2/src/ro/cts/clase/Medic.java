package ro.cts.clase;

public class Medic extends PersonalSpital {
    public Medic(String numeSpital,String nume, float salariu, int vechime) {
        super(numeSpital, nume, salariu, vechime);
    }

    @Override
    public void descrie() {
        System.out.println("Medicul cu numele "+ getNume()+" lucreaza la "+getNumeSpital()+ " de "+getVechime()+" si are un salariu de "+getSalariu());
    }
}
