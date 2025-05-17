package ro.cts.main;

import ro.cts.clase.Card;
import ro.cts.clase.RetragereCardFizic;
import ro.cts.clase.RetragereContactLess;
import ro.cts.clase.TemplateRetragereBancomat;

public class Main {
    public static void main(String[] args){
        Card card = new Card("Ion","BCR",1000);
        TemplateRetragereBancomat bancomatFizic = new RetragereCardFizic();
        TemplateRetragereBancomat bancomatContactLess = new RetragereContactLess();

        bancomatFizic.retragereDeLaBancomat(card,1234,200);
        bancomatContactLess.retragereDeLaBancomat(card,1234,300);
        System.out.println(card.getSoldCurent());
    }
}
