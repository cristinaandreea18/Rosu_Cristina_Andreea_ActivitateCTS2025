package ro.cts.clase;

public abstract class TemplateRetragereBancomat {
    public void retragereDeLaBancomat(Card card,int pin,float suma){
        introduceCard(card);
        introducePin(pin);
        if(suma<card.getSoldCurent()){
           Float sumaActualizata = card.getSoldCurent()-suma;
           card.setSoldCurent(sumaActualizata);
           retragereBancomat(suma);
        }
        retragereCard(card);
    }
    abstract void introduceCard(Card card);
    abstract void introducePin(int pin);
    abstract void retragereBancomat(float suma);
    abstract void retragereCard(Card card);

}
