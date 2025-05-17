package ro.cts.clase;

public class RetragereContactLess extends TemplateRetragereBancomat {
    @Override
    void introduceCard(Card card) {
        System.out.println("Cardul a fost scanat contactless");
    }

    @Override
    void introducePin(int pin) {
        System.out.println("Pin-ul "+pin+" a fost validat prin NFC");
    }

    @Override
    void retragereBancomat(float suma) {
        System.out.println("S-a retras suma de "+suma+ " RON prin contactless");
    }

    @Override
    void retragereCard(Card card) {
        System.out.println("A fost indeparatat cardul");
    }
}
