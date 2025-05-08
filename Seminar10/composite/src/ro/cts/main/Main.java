package ro.cts.main;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("Ortopedie", 10);
        Structura departament2 = new Departament("Pediatrie", 10);
        Structura departamentGeneral = new Departament("general", 40);

        Structura sectie1 = new Sectie("sectie1");
        Structura sectie2 = new Sectie("sectie2");

        try {
            departamentGeneral.adaugaStructura(departament1);
            departamentGeneral.adaugaStructura(departament2);

            departament1.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);

            departamentGeneral.afiseazaDescriere();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
