package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata {
    private int numarCalatoriiRamase;

    public CardCalatorie(int numarCalatoriiRamase) {
        this.numarCalatoriiRamase = numarCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(numarCalatoriiRamase>0){
            System.out.println("Am platit cu cardul de calatorii");
            numarCalatoriiRamase-=1;
            System.out.println("Mai am "+numarCalatoriiRamase+" calatorie/calatorii ramase");
        }
        else
        {
            System.out.println("Nu ai calatorii ramase pe cardul de calatorii!");
        }
    }
}
