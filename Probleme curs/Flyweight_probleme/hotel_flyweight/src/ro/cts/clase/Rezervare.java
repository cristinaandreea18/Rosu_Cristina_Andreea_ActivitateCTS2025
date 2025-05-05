package ro.cts.clase;

public class Rezervare {
    private String numeClient;
    private int numarCamera;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarCamera=").append(numarCamera);
        sb.append('}');
        return sb.toString();
    }

    public Rezervare(String numeClient, int numarCamera) {
        this.numeClient = numeClient;
        this.numarCamera = numarCamera;
    }
}
