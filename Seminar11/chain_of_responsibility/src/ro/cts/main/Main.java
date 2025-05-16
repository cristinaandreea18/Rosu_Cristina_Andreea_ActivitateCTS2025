package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        InfoMijlocTransport troleibuz = new Troleibuz();
        InfoMijlocTransport autobuz = new Autobuz();
        InfoMijlocTransport tramvai = new Tramvai();
        InfoMijlocTransport metrou = new Metrou();

        troleibuz.setMijlocTransport(autobuz);
        autobuz.setMijlocTransport(tramvai);
        tramvai.setMijlocTransport(metrou);
        metrou.setMijlocTransport(null);

        troleibuz.recomandaTransport(9);
        troleibuz.recomandaTransport(12);
        troleibuz.recomandaTransport(4);
    }
}
