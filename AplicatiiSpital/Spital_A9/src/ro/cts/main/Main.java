package ro.cts.main;

import ro.cts.clase.IInternare;
import ro.cts.clase.Internare;
import ro.cts.clase.Persoana;
import ro.cts.clase.ProxyInternare;

public class Main {
    public static void main(String[] args){
        IInternare internare1 = new Internare(new Persoana("Ion",false));
        ProxyInternare proxy = new ProxyInternare((Internare) internare1);

        internare1.internare();
        proxy.internare();
    }
}
