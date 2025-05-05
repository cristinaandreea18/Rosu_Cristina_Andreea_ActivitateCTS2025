package ro.cts.clase;

public class AutobuzLinie {
    private String model;
    private String numeSofer;
    private boolean hasOpririCapatLinie;
    private boolean hasSolicitareDeschidereUsi;
    private boolean hasTextEcranDerulant;

    public AutobuzLinie(String model, String numeSofer, boolean hasOpririCapatLinie, boolean hasSolicitareDeschidereUsi, boolean hasTextEcranDerulant) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.hasOpririCapatLinie = hasOpririCapatLinie;
        this.hasSolicitareDeschidereUsi = hasSolicitareDeschidereUsi;
        this.hasTextEcranDerulant = hasTextEcranDerulant;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setHasOpririCapatLinie(boolean hasOpririCapatLinie) {
        this.hasOpririCapatLinie = hasOpririCapatLinie;
    }

    public void setHasSolicitareDeschidereUsi(boolean hasSolicitareDeschidereUsi) {
        this.hasSolicitareDeschidereUsi = hasSolicitareDeschidereUsi;
    }

    public void setHasTextEcranDerulant(boolean hasTextEcranDerulant) {
        this.hasTextEcranDerulant = hasTextEcranDerulant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", hasOpririCapatLinie=").append(hasOpririCapatLinie);
        sb.append(", hasSolicitareDeschidereUsi=").append(hasSolicitareDeschidereUsi);
        sb.append(", hasTextEcranDerulant=").append(hasTextEcranDerulant);
        sb.append('}');
        return sb.toString();
    }
}
