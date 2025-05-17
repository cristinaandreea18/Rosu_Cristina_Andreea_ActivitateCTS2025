package ro.cts.clase;

public class RetragereCardFizic extends TemplateRetragereBancomat {
    @Override
    void introduceCard(Card card) {
        System.out.println("Cardul fizic a fost introdus in bancomat");
    }

    @Override
    void introducePin(int pin) {
        System.out.println("PIN-ul introdus este "+pin);
    }

    @Override
    void retragereBancomat(float suma) {
        System.out.println("S-a realizat o retragere de "+suma+ " RON de la ATM");
    }

    @Override
    void retragereCard(Card card) {
        System.out.println("Cardul fizic a fost extras din bancomat");
    }
}
