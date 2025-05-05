package ro.cts.clase;

public class Portbagaj extends ComponentaAuto implements IComponenta {
    public Portbagaj(String culoare, float greutate) {
        super(culoare, greutate);
    }

    @Override
    public void descrie() {
        System.out.println("Aceasta este un portbagaj de culoare "+ getCuloare() +" si greutate "+ getGreutate());
    }
}
