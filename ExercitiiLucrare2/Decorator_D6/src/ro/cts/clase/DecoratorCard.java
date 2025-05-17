package ro.cts.clase;

public abstract class DecoratorCard implements Card {
    private Card card;

    public DecoratorCard(Card card) {
        this.card = card;
    }

    @Override
    public void realizarePlata() {
        card.realizarePlata();
        imbunatatireCard();
    }

    protected abstract void imbunatatireCard();
}
