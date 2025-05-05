package ro.cts.clase;

public class Capota extends ComponentaAuto implements IComponenta {
    public Capota(String culoare, float greutate) {
        super(culoare, greutate);
    }

    @Override
    public void descrie() {
        System.out.println("Aceasta este o capota de culoare "+ getCuloare() +" si greutate "+ getGreutate());
    }
}
