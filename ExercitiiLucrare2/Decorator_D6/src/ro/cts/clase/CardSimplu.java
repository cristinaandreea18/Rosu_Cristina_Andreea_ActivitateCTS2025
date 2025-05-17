package ro.cts.clase;

public class CardSimplu implements Card {
    private String titularCard;

    public CardSimplu(String titularCard) {
        this.titularCard = titularCard;
    }

    @Override
    public void realizarePlata() {
        System.out.println("Clientul "+titularCard+ " poate realiza plata online sau plata normala cu cardul");
    }
}
