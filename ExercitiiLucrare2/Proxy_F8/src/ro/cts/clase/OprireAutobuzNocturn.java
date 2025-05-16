package ro.cts.clase;

public class OprireAutobuzNocturn implements IAutobuz {
    private IAutobuz autobuz;

    public OprireAutobuzNocturn(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String numarAutobuz, String statie, int numarCalatori) {
        if(numarCalatori>0){
            this.autobuz.opresteInStatie(numarAutobuz,statie,numarCalatori);
        }
        else {
            System.out.println("Autobuzul "+numarAutobuz+" se retrage la autobaza fara sa mai realizeze opriri");
        }
    }
}
