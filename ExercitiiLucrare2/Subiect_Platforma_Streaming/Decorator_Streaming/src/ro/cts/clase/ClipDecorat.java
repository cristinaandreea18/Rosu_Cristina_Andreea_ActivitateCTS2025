package ro.cts.clase;

public abstract class ClipDecorat implements ClipVideo {
    private ClipVideo video;

    public ClipDecorat(ClipVideo video) {
        this.video = video;
    }

    @Override
    public void redareVideo() {
        video.redareVideo();
        redareCuReclama();
    }

    protected abstract void redareCuReclama();
}
