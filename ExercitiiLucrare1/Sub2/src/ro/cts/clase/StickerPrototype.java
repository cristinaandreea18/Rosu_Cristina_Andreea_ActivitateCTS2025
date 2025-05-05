package ro.cts.clase;

public class StickerPrototype extends ASticker {
    public StickerPrototype(){
        super();
    }
    public StickerPrototype(Masina masina){
       super(masina);
    }
    @Override
    public ASticker clone() {
        ASticker sticker = new StickerPrototype();
        sticker.setDimensiune(this.getDimensiune());
        return sticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StickerPrototype{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}
