package ro.cts.main;

import ro.cts.clase.ClientFarmacie;
import ro.cts.clase.Farmacie;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args){
        Observer client1 = new ClientFarmacie("Ionel");
        Observer client2 = new ClientFarmacie("Marian");
        Observer client3 = new ClientFarmacie("Valentin");

        Farmacie farmacie = new Farmacie();
        farmacie.aboneazaClient(client1);
        farmacie.aboneazaClient(client2);

        farmacie.trimiteOferta("paracetamol",21.99f);
        farmacie.trimiteOferta("decasept",15.99f);

        farmacie.dezaboneazaClient(client1);
        farmacie.aboneazaClient(client3);
        farmacie.trimiteOferta("tantum verde spray",25f);

    }
}
