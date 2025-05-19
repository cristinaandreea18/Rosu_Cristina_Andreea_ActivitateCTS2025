package ro.cts.main;

import ro.cts.clase.PachetCazare;
import ro.cts.clase.PachetMasinaInchiriata;
import ro.cts.clase.PachetTuristic;
import ro.cts.inchieremasini.Masina;
import ro.cts.inchieremasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic){
        System.out.println("Pentru clinent:");
        pachetTuristic.descrire();
        System.out.println("Pentru sistem:");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args){
        PachetTuristic pachetTuristic = new PachetCazare();
        printeazaRezervare(pachetTuristic);

        System.out.println("Utilizare in mod clasic");
        Masina masina = new Masina("Opel",1300);
        MasinaInchiriata masinaInchiriata= new MasinaInchiriata(masina);
        System.out.println("Pentru client:");
        System.out.println(masinaInchiriata.toString());

        System.out.println("Pentru operator:");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Utilizare adapter");
        Masina masina2 = new Masina("Renault",1400);
        MasinaInchiriata masinaInchiriata2 = new MasinaInchiriata(masina2);
        PachetTuristic pachetTuristic2 = new PachetMasinaInchiriata(masinaInchiriata2);
        printeazaRezervare(pachetTuristic2);
    }
}
