package ro.cts.main;

import ro.cts.clase.Card;
import ro.cts.clase.CardSimplu;
import ro.cts.clase.ContactLess;

public class Main {
    public static void main(String[] args){
        Card card = new CardSimplu("Alex");
        card.realizarePlata();

        Card cardDecorat = new ContactLess(card);
        cardDecorat.realizarePlata();
    }
}
