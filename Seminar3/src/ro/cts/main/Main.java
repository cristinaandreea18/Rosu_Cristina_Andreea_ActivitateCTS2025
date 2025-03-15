package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;
import ro.cts.registry.Reglementare;

public class Main {
    public static void main(String []args){
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("www.autoritate.reglementare.ro");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModel("Dacia Logan");
        System.out.println(autoritate);

        AutoritateReglementareMasiniLazy autoritate3 = AutoritateReglementareMasiniLazy.getInstance("auto3","www.auto3.ro");
        System.out.println(autoritate3);

        AutoritateReglementareMasiniLazy autoritate4 = AutoritateReglementareMasiniLazy.getInstance("auto4","www.auto4.ro");
        System.out.println(autoritate4);

    }
}
