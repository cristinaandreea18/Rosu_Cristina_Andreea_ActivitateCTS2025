package ro.cts.clase;

public class OprireAutobuz implements IAutobuz {
    @Override
    public void opresteInStatie(String numarAutobuz, String statie, int numarCalatori) {
        System.out.println("Autobuzul "+numarAutobuz+" a oprit in statia "+statie+" avand un numar de "+numarCalatori+" calatori");
    }
}
