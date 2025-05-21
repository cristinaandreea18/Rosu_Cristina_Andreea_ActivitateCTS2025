package ro.cts.main;

import ro.cts.clase.ClientFidel;
import ro.cts.clase.Observer;
import ro.cts.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ClientFidel("Ion");
        Observer observer2 = new ClientFidel("Mihai");
        Observer observer3 = new ClientFidel("Bogdan");

        Restaurant restaurant = new Restaurant("La tigrutz");
        restaurant.adaugaObserver(observer1);
        restaurant.adaugaObserver(observer2);
        restaurant.adaugaObserver(observer3);

        restaurant.trimiteOferta("Clatite americane",15);
    }
}
