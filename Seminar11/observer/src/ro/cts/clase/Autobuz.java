package ro.cts.clase;

public class Autobuz extends MijlocTransport {

    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
       trimiteMesaj("Autobuzul cu numarul "+this.getNumarLinie()+" a plecat de la capat!");
    }

    public void schimbaTraseul(){
        trimiteMesaj("Autobuzul cu numarul "+this.getNumarLinie()+
                " va circula astazi prin Bd. Balcescu si nu ma circula pe la Piata Romana");
    }
}
