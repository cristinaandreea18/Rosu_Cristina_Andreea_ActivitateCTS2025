package ro.cts.main;

import ro.cts.clase.PachetCazare;
import ro.cts.clase.PachetMasinaInchiriata;
import ro.cts.clase.PachetTuristic;
import ro.cts.inchirieremasini.Masina;
import ro.cts.inchirieremasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic){
        System.out.println("Pentru client:");
        pachetTuristic.descriere();
        System.out.println("Pentru operator:");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args){
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        System.out.println("Se doreste utilizarea librariei petru masini inchiriate");
        System.out.println("Utilizare in modul clasic");
        Masina masina = new Masina("Opel",1300);
        MasinaInchiriata masinaInchiriata =  new MasinaInchiriata(masina);
        System.out.println();
        System.out.println("Nu se foloseste metoda de printare");
        System.out.println("Pentru client:");
        System.out.println(masinaInchiriata.toString());
        System.out.println("Pentru operator:");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Se utilizeaza adapterul");
        Masina masina2 = new Masina("Renault",1400);
        System.out.println();
        System.out.println("Pachet creat direct cu masina dorita");
        PachetMasinaInchiriata pachetMasinaInchiriata= new PachetMasinaInchiriata(masina2);
        System.out.println();
        System.out.println("Se foloseste metoda de printare");
        printeazaRezervare(pachetMasinaInchiriata);
    }
}
