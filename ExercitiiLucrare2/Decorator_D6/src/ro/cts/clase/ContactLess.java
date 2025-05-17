package ro.cts.clase;

public class ContactLess extends DecoratorCard {
    public ContactLess(Card card) {
        super(card);
    }

    @Override
    protected void imbunatatireCard() {
        System.out.println("Se poate realiza plata utilizand ContactLess");
    }
}
