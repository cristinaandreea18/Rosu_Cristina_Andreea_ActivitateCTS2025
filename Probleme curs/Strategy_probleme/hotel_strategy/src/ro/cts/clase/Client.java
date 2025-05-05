package ro.cts.clase;

public class Client {
    private String nume;
    private ModVerificare modVerificare;

    public Client(String nume, ModVerificare modVerificare) {
        this.nume = nume;
        this.modVerificare = modVerificare;
    }

    public void verificaDocumente(){
        modVerificare.verificareActe(nume);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModVerificare getModVerificare() {
        return modVerificare;
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }
}
