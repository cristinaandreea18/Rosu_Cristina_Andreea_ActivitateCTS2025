package ro.cts.main;

import ro.cts.clase.Bilet;
import ro.cts.clase.BiletDecorator;
import ro.cts.clase.BiletGazda;
import ro.cts.clase.BiletSimplu;

public class Main {
    public static void main(String[] args){
        Bilet bilet1 = new BiletSimplu("Echipa1", "Echipa2");
        Bilet bilet2 = new BiletSimplu("EchipaX","EchipaY");

        BiletDecorator biletDecorator= new BiletGazda(bilet1,"FC Bucuresti");
        biletDecorator.printare();

        BiletDecorator biletDecorator2 = new BiletGazda(bilet2,"FC Craiova");
        biletDecorator2.printare();
    }
}
