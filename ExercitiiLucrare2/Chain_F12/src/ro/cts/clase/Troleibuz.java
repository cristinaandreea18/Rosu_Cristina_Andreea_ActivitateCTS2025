package ro.cts.clase;

public class Troleibuz extends HandlerTransport {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta<3){
            System.out.println("Se ia troleibuzul!");
        }
        else {
            this.getUrmatorul().recomandaTransport(distanta);
        }
    }
}
