package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.PersoaneFizice;
import ro.cts.clase.PersoaneJuridice;
import ro.cts.clase.TipClient;

public class Main {
    public static void main(String[] args){
        TipClient tip = new PersoaneFizice();
        Client client1 = new Client("Andrei",tip);
        client1.trimiteDocumenteCatreVerificare();
        client1.setTip(new PersoaneJuridice());
        client1.trimiteDocumenteCatreVerificare();
    }
}
