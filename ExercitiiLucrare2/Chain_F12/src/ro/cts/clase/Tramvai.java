package ro.cts.clase;

public class Tramvai extends HandlerTransport {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta>=5 && distanta<10){
            System.out.println("Se ia tramvaiul!");
        }
        else {
            this.getUrmatorul().recomandaTransport(distanta);
        }
    }
}
