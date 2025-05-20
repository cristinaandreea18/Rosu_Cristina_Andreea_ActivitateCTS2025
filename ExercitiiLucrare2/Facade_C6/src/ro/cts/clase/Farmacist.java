package ro.cts.clase;

public class Farmacist {
    private String denumireFarmacie;

    public Farmacist(String denumireFarmacie) {
        this.denumireFarmacie = denumireFarmacie;
    }

    public boolean verificareCardSanatate(){
        System.out.println("A fost verificat cardul de sanatate!");
        return true;
    }
}
