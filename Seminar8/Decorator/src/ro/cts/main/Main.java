package ro.cts.main;

import ro.cts.clase.Nota;
import ro.cts.clase.NotaDePlata;
import ro.cts.clase.NotaDePlataCraciun;
import ro.cts.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args){
        Nota nota = new NotaDePlata(150);
        nota.printare();
        System.out.println("\n");

        Nota notaDecorata = new NotaDePlataRevelion(nota);
        notaDecorata.printare();
        System.out.println("\n");

        Nota notaDecorata2 = new NotaDePlataCraciun(nota);
        Nota nota2 = new NotaDePlataCraciun(notaDecorata);
        nota2.printare();
        notaDecorata2.printare();
        System.out.println("\n");
    }
}
