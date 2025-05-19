package ro.cts.main;

import ro.cts.clase.ClipCuReclame;
import ro.cts.clase.ClipVideo;
import ro.cts.clase.VideoSimplu;

public class Main {
    public static void main(String[] args){
        ClipVideo clipVideoSimplu = new VideoSimplu("Tiramisu");
        clipVideoSimplu.redareVideo();

        ClipVideo clipCuReclame = new ClipCuReclame(clipVideoSimplu,13,2);
        clipCuReclame.redareVideo();
    }
}
