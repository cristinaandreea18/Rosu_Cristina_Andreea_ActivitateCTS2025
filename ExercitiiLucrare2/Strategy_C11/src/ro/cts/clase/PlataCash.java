package ro.cts.clase;

public class PlataCash implements IModPlata {
    @Override
    public void plateste() {
        System.out.println("A fost realizata plata cash!");
    }
}
