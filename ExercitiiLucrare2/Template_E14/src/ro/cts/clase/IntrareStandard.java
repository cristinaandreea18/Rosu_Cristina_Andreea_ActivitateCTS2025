package ro.cts.clase;

public class IntrareStandard extends TemplateIntrareStadion {
    @Override
    boolean asezareLaCoada() {
        System.out.println("Se asteapta la coada");
        return true;
    }

    @Override
    boolean prezentareBilet(Bilet bilet) {
        System.out.println("Se scaneaza biletul in format fizic");
        return true;
    }

    @Override
    boolean controlCorporal() {
        System.out.println("Realizare control corporal complet");
        return true;
    }

    @Override
    void intrarePeStadion() {
        System.out.println("Intrarea se face utilizand poarta standard");
    }

    @Override
    void ocupareLoc() {
        System.out.println("S-a ocupat loc pe stadion");
    }
}
