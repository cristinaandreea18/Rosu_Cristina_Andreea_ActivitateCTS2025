package ro.cts.clase;

public abstract class ASticker {
   protected int dimensiune;

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public ASticker(){
        dimensiune = 0;
    }

    public ASticker(Masina masina){
        try {
            Thread.sleep(3000);
            StickerPrototype sticker = new StickerPrototype();
            if (masina.getModelMasina().equals("Dacia")) {
                this.dimensiune = 220;
            } else {
                if (masina.getModelMasina().equals("Opel")) {
                   this.dimensiune =250;
                } else {
                    if (masina.getModelMasina().equals("Audi")) {
                        this.dimensiune = 280;
                    } else {
                        this.dimensiune = 270;
                    }
                }
            }

            if (masina.getAnFabricatie() > 2008) {
                this.dimensiune+=10;
            } else {
               this.dimensiune-=10;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public abstract ASticker clone();

}
