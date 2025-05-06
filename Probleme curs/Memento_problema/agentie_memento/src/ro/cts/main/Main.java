package ro.cts.main;

import ro.cts.clase.ManagerPachete;
import ro.cts.clase.PachetTuristic;

public class Main {
    public static void main(String[] args){
        PachetTuristic pachet = new PachetTuristic(500);
        ManagerPachete managerPachete = new ManagerPachete();

        System.out.println(pachet);

        managerPachete.adaugaMemento(pachet.salvareMemento());
        pachet.setPret(400);
        managerPachete.adaugaMemento(pachet.salvareMemento());
        System.out.println(pachet);

        try{
           pachet.undoToMemento(managerPachete.getMemento(0));
            System.out.println(pachet);
        }
        catch (Exception ex){

        }
    }
}
