package ro.cts.clase;

public class Client implements IClient {
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    public Client(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void descrieClient(Rezervare rezervare) {
        System.out.println("Clientul cu numele "+nume
                +" a realizat o rezervare folosind numarul de telefon "
                +numarTelefon+" pentru ora "+rezervare.getOraRezervare()
                +" la masa cu nr "
                +rezervare.getNumarMasa()
                +" pentr un numar de "+rezervare.getNumarPersoane()+" persoane");
    }
}
