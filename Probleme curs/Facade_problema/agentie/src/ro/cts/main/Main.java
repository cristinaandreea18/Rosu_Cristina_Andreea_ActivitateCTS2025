package ro.cts.main;

import ro.cts.clase.Facade;

public class Main {
    public static void main(String[]args){
        Facade rezervareSejur = new Facade();
        rezervareSejur.rezervaPachetCazareTransport("Bucuresti","Brasov");
    }
}
