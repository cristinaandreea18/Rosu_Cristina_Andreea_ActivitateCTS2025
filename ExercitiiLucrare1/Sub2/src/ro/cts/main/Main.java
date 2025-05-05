package ro.cts.main;

import ro.cts.clase.ASticker;
import ro.cts.clase.ComponentaAuto;
import ro.cts.clase.Masina;
import ro.cts.clase.StickerPrototype;
import ro.cts.clase.factory.FabricaDeComponente;
import ro.cts.clase.factory.TipComponente;

public class Main {
    public static void main(String[]args){
        Masina masina = new Masina("Dacia",2010);
        masina.colantare();
        ASticker sticker = new StickerPrototype(masina);
        System.out.println(sticker);
        ASticker sticker2 = sticker.clone();
        System.out.println(sticker2);


        FabricaDeComponente fabricaDeComponente = new FabricaDeComponente("ABC","Rosiori de Vede");
        ComponentaAuto usa = fabricaDeComponente.getComponenta(TipComponente.Usa,"gri",20);
        ComponentaAuto portbagaj = fabricaDeComponente.getComponenta(TipComponente.Portbagaj,"negru",15);
        ComponentaAuto bara = fabricaDeComponente.getComponenta(TipComponente.Bara,"rosu",7);
        ComponentaAuto capota = fabricaDeComponente.getComponenta(TipComponente.Capota,"negru",10);

        usa.descrie();
        portbagaj.descrie();
        bara.descrie();
        capota.descrie();
;    }
}
