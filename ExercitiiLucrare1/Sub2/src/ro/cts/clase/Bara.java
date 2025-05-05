package ro.cts.clase;

public class Bara extends ComponentaAuto implements IComponenta {
    public Bara(String culoare, float greutate) {
        super(culoare, greutate);
    }

    @Override
    public void descrie() {
        System.out.println("Aceasta este o bara de culoare "+ getCuloare() +" si greutate "+ getGreutate());
    }
}
