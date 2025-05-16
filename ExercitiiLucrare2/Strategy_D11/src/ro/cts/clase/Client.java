package ro.cts.clase;

public class Client {
    private String nume;
    private TipClient tip;

    public Client(String nume, TipClient tip) {
        this.nume = nume;
        this.tip = tip;
    }

    public Client(String nume) {
        this.nume = nume;
        this.tip = new PersoaneFizice();
    }

    public void setTip(TipClient tip) {
        this.tip = tip;
    }

    public void trimiteDocumenteCatreVerificare(){
        this.tip.verificareActe();
    }
}
