package ro.cts.main;

import ro.cts.clase.ClipVideo;
import ro.cts.clase.IClip;
import ro.cts.clase.Playlist;

public class Main {
    public static void main(String[] args){
        IClip clip1 = new ClipVideo("Clip 1",5,"educational");
        IClip clip2 = new ClipVideo("Clip 2",6,"muzica");
        IClip clip3 = new ClipVideo("Clip 3",7, " educational");
        IClip clip4 = new ClipVideo("Clip 4",6,"muzica");

        IClip playList1 = new Playlist("Playlist 1-Nivel principal",3);
        IClip playList2 = new Playlist("Playlist 2-Nivel intermediar",2);

        IClip playList3 = new Playlist("Playlist 3-Ultimul nivel",1);

        try {
            playList1.adaugaClip(clip1);
            playList1.adaugaClip(clip4);
            playList1.adaugaClip(clip3);

            playList2.adaugaClip(playList1);
            playList2.adaugaClip(clip2);

            playList3.adaugaClip(playList2);
            playList3.afiseazaDetalii();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }

    }
}
