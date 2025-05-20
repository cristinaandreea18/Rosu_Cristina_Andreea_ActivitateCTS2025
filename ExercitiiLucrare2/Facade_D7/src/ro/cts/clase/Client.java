package ro.cts.clase;

public class Client {
    private String nume;
    private int varsta;
    private boolean areCazier;
    private boolean areCreate;

    public Client(String nume, int varsta, boolean areCazier,boolean areCreate) {
        this.nume = nume;
        this.varsta = varsta;
        this.areCazier = areCazier;
        this.areCreate = areCreate;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public boolean esteUrmaritDePolitie(){
        return areCazier;
    }

    public boolean areCreateLaAlteBanci(){
        return areCreate;
    }
}

