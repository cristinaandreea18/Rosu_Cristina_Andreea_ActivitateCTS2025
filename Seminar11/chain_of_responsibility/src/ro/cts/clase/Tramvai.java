package ro.cts.clase;

public class Tramvai extends InfoMijlocTransport {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta<10){
            System.out.println("Calatorul va lua tramvaiul");
        }
        else {
            this.getMijlocTransport().recomandaTransport(distanta);
        }
    }
}
