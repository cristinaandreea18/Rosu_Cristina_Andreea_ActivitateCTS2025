package ro.cts.clase;

public class Autobuz extends HandlerTransport {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta>=3 && distanta<5){
            System.out.println("Se ia autobuzul!");
        }
        else {
            this.getUrmatorul().recomandaTransport(distanta);
        }
    }
}
