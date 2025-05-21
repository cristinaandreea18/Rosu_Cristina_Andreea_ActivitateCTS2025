package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        HandlerTransport troleibuz = new Troleibuz();
        HandlerTransport autouz = new Autobuz();
        HandlerTransport tramvai = new Tramvai();
        HandlerTransport metrou = new Metrou();

        troleibuz.setUrmatorul(autouz);
        autouz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);
        metrou.setUrmatorul(null);

        troleibuz.recomandaTransport(5);
        troleibuz.recomandaTransport(10);
        troleibuz.recomandaTransport(4);
        troleibuz.recomandaTransport(2);

    }
}
