package ro.cts.main;

import ro.cts.clase.BibliotecaBuilder;
import ro.cts.clase.Builder;
import ro.cts.clase.ManagerAbonamente;
import ro.cts.clase.Publicatie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        ManagerAbonamente managerAbonamente = ManagerAbonamente.getInstance("Netflix");
        managerAbonamente.addSubscription(14);
        managerAbonamente.addSubscription(16);
        managerAbonamente.addSubscription(15);

        System.out.println(managerAbonamente);
        ManagerAbonamente managerAbonamente2 = ManagerAbonamente.getInstance("Disney PLus");
        System.out.println(managerAbonamente2);

        Builder builder = new BibliotecaBuilder("Mihai Eminescu");
        List<String> authors = new ArrayList<>();
        authors.add("Cassandra Clare");
        Publicatie publicatie1 = builder.setTitle("Ingerul mecanic").setAuthors(authors).setGenre("fantasy").setLanguage("romana").setPrice(70).setYear(2010).build();
        System.out.println(publicatie1);

    }
}
