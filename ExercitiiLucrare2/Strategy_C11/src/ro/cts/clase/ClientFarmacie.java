package ro.cts.clase;

public class ClientFarmacie {
    private String nume;
    private IModPlata modalitatePlata;

    public ClientFarmacie(String nume) {
        this.nume = nume;
        this.modalitatePlata= new PlataCash();
    }

    public ClientFarmacie(String nume, IModPlata modalitatePlata) {
        this.nume = nume;
        this.modalitatePlata = modalitatePlata;
    }

    public void setModalitatePlata(IModPlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void realizeazaPlata(){
        modalitatePlata.plateste();
    }
}
