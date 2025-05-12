package ro.cts.clase;

public class PlatesteSMS implements IMetodaPlata {

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Am platit prin SMS");
    }
}
