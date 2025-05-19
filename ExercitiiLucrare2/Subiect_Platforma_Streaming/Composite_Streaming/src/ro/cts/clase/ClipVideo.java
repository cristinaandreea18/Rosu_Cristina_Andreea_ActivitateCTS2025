package ro.cts.clase;

public class ClipVideo implements IClip {
    private String nume;
    private int durata;
    private String gen;

    public ClipVideo(String nume, int durata, String gen) {
        this.nume = nume;
        this.durata = durata;
        this.gen = gen;
    }

    @Override
    public void adaugaClip(IClip clipDeAdaugat) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeClip(IClip clipDeSters) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void afiseazaDetalii()  {
        System.out.println("Clipul video "+nume);
    }

    @Override
    public IClip getClipDinStructura(int cheie) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClipVideo{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", durata=").append(durata);
        sb.append(", gen='").append(gen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
