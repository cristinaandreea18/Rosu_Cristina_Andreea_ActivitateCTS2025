package ro.cts.clase;

public class Client implements AbstractClient {
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    public Client(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrieClient(Rezervare rezervare) {
        System.out.println(this.toString()+ rezervare.toString());
    }
}
