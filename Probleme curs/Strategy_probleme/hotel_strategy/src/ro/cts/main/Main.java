package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.VerificareAmericani;
import ro.cts.clase.VerificareNonUE;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Andrei",new VerificareNonUE());
        client.verificaDocumente();
        client.setModVerificare(new VerificareAmericani());
        client.verificaDocumente();
    }
}
