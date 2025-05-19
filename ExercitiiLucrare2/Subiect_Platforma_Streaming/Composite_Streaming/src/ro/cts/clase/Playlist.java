package ro.cts.clase;

import java.util.List;
import java.util.ArrayList;

public class Playlist implements IClip {
    private String numePlaylist;
    private int numarClipuri;
    private List<IClip>colectieClipuri;

    public Playlist(String numePlaylist, int numarClipuri) {
        this.numePlaylist = numePlaylist;
        this.numarClipuri = numarClipuri;
        this.colectieClipuri = new ArrayList<IClip>();
    }

    @Override
    public void adaugaClip(IClip clipDeAdaugat) throws Exception {
        colectieClipuri.add(clipDeAdaugat);
    }

    @Override
    public void stergeClip(IClip clipDeSters) throws Exception {
        colectieClipuri.remove(clipDeSters);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Video-urile din playlist-ul "+numePlaylist + " sunt urmatoarele:");
        for(IClip clip: colectieClipuri){
            clip.afiseazaDetalii();
        }
    }

    @Override
    public IClip getClipDinStructura(int cheie) throws Exception {
        return colectieClipuri.get(cheie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Playlist{");
        sb.append("numePlaylist='").append(numePlaylist).append('\'');
        sb.append(", numarClipuri=").append(numarClipuri);
        sb.append(", colectieClipuri=").append(colectieClipuri);
        sb.append('}');
        return sb.toString();
    }
}
