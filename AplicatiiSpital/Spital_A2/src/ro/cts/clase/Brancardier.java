package ro.cts.clase;

public class Brancardier extends PersonalSpital {
    public Brancardier(String numeSpital,String nume, float salariu, int vechime) {
        super(numeSpital, nume, salariu, vechime);
    }

    @Override
    public void descrie() {
        System.out.println("Brancardierul cu numele "+ getNume()+" lucreaza la "+getNumeSpital()+ " de "+getVechime()+" si are un salariu de "+getSalariu());

    }
}
