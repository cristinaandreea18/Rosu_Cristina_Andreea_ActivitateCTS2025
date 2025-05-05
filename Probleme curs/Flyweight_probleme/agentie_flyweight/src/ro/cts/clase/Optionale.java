package ro.cts.clase;

public class Optionale {
    private boolean cina;
    private int numarExcursii;

    public Optionale(boolean cina, int numarExcursii) {
        this.cina = cina;
        this.numarExcursii = numarExcursii;
    }

    public boolean isCina() {
        return cina;
    }

    public void setCina(boolean cina) {
        this.cina = cina;
    }

    public int getNumarExcursii() {
        return numarExcursii;
    }

    public void setNumarExcursii(int numarExcursii) {
        this.numarExcursii = numarExcursii;
    }
}
