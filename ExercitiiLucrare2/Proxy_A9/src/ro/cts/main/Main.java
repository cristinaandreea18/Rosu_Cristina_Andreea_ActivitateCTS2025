package ro.cts.main;

import ro.cts.clase.AbstractInternare;
import ro.cts.clase.Internare;
import ro.cts.clase.Pacient;
import ro.cts.clase.ProxyInternare;

public class Main {
    public static void main(String[] args){
        Pacient pacient1 = new Pacient("Ion",3,null);
        AbstractInternare internare1 = new Internare();
        internare1.internare(pacient1);

        AbstractInternare internare2 = new ProxyInternare(internare1);
        internare2.internare(pacient1);
    }
}
