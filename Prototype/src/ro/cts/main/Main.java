package ro.cts.main;

import ro.cts.clase.RezervareCina;
import ro.cts.clase.RezervarePetrecere;

public class Main {
    public static void main(String[]args){
        RezervareCina rezervareCina = new RezervareCina("Dorel",6,"0761234567",true);
        RezervareCina rezervareCina2 = (RezervareCina) rezervareCina.copiaza("Alina");
        System.out.println(rezervareCina2);

        RezervarePetrecere rezervarePetrecere = new RezervarePetrecere("Auras",2,"0768953421","Valentine's Day");
        RezervarePetrecere rezervarePetrecere2 = (RezervarePetrecere) rezervarePetrecere.copiaza("Violeta");
        System.out.println(rezervarePetrecere2);
    }
}
