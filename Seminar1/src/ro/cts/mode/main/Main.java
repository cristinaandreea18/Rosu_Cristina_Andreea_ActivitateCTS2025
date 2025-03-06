package ro.cts.mode.main;

import ro.cts.mode.personal.*;
import ro.cts.mode.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Andrei",20,11,900));
        studenti.add(new Student("Bianca",21,15,1000));
        Curs c1 = new Curs("CTS",4,new Profesor("Ion",40,10,8000,0.19f),studenti);
        c1.sustineExamen("05/06/2025");

        c1.getProfesor().preda();
        System.out.println("Venitul profesorului:"+((Persoana)c1.getProfesor()).calculareVenit());
        c1.setProfesor(new Asistent("Dorel",29,17,6800));
        c1.sustineExamen("11/06/2025");

        Lector lector = new Lector("Maricica",39);
        c1.setProfesor(lector);
        c1.sustineExamen("12/06/2025");
    }
}
