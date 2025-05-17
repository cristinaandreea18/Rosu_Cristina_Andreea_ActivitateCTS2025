package ro.cts.clase;

public class Card {
    private String detinator;
    private String sucursala;
    private float soldCurent;

    public Card(String detinator, String sucursala, float soldCurent) {
        this.detinator = detinator;
        this.sucursala = sucursala;
        this.soldCurent = soldCurent;
    }

    public void setSoldCurent(float soldCurent) {
        this.soldCurent = soldCurent;
    }

    public float getSoldCurent() {
        return soldCurent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", denumireSucursala='").append(sucursala).append('\'');
        sb.append(", soldCurent=").append(soldCurent);
        sb.append('}');
        return sb.toString();
    }
}
