package ro.cts.clase;

public class PlataCard implements IModPlata {
    @Override
    public void plateste() {
        System.out.println("A fost realizata plata cu cardul!");
    }
}
