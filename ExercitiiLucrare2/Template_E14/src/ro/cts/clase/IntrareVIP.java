package ro.cts.clase;

public class IntrareVIP extends TemplateIntrareStadion {
    @Override
    boolean asezareLaCoada() {
        System.out.println("Accesul VIP nu necesita asteptarea la coada");
        return false;
    }

    @Override
    boolean prezentareBilet(Bilet bilet) {
        System.out.println("Prezentare bilet digital");
        return bilet.getCodAcces()!=null && bilet.isVIP();
    }

    @Override
    boolean controlCorporal() {
        System.out.println("Control minimal pentru acces VIP");
        return true;
    }

    @Override
    void intrarePeStadion() {
        System.out.println("Acces prin zona VIP");
    }

    @Override
    void ocupareLoc() {
        System.out.println("Ocupare loc in zona destinata spectatorilor VIP");
    }
}
