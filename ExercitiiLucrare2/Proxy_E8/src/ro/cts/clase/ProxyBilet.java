package ro.cts.clase;

public class ProxyBilet implements IBilet {
    private IBilet bilet;

    public ProxyBilet(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBilet(String nume, float pret, int varsta) {
        if(varsta>14){
            this.bilet.vindeBilet(nume,pret,varsta);
        }
        else {
            System.out.println("Acces restrictionat datorita varstei! Nu se poate vinde biletul");
        }
    }
}
