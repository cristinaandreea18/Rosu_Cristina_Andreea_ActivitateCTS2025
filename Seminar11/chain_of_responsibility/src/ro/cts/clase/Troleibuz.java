package ro.cts.clase;

public class Troleibuz extends InfoMijlocTransport {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta<3){
            System.out.println("Calatorul va lua troleibuzul");
        }
        else
        {
            this.getMijlocTransport().recomandaTransport(distanta);
        }
    }
}
