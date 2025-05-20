package ro.cts.main;

import ro.cts.clase.Banca;
import ro.cts.clase.Observer;
import ro.cts.clase.Pacient;

public class Main {
    public static void main(String[] args){
        Observer pacient1 = new Pacient("Marin");
        Observer pacient2 = new Pacient("Alin");
        Observer pacient3 = new Pacient("Mihai");

        Banca banca = new Banca();
        banca.adaugaObserver(pacient1);
        banca.adaugaObserver(pacient2);
        banca.adaugaObserver(pacient3);

        banca.trimiteOferta("virus");
    }
}
