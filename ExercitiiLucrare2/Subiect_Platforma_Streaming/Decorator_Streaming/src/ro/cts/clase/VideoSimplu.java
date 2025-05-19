package ro.cts.clase;

public class VideoSimplu implements ClipVideo {
    private String nume;

    public VideoSimplu(String nume) {
        this.nume = nume;
    }

    @Override
    public void redareVideo() {
        System.out.println("Redare clip "+nume);
    }
}
