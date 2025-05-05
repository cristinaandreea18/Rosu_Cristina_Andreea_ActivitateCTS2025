package ro.cts.clase;

public class Usa extends ComponentaAuto implements IComponenta {
    public Usa(String culoare, float greutate) {
        super(culoare, greutate);
    }

    @Override
    public void descrie() {
        System.out.println("Aceasta este o usa de culoare "+ getCuloare() +" si greutate "+ getGreutate());
    }
}
