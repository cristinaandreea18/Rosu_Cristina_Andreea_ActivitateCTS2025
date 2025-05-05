package ro.cts.clase;

public class BuilderAutobuz implements Builder {
    private String oras;
    private String model;
    private String numeSofer;
    private boolean hasOpririCapatLinie;
    private boolean hasSolicitareDeschidereUsi;
    private boolean hasTextEcranDerulant;
    private static BuilderAutobuz instance = null;

    private BuilderAutobuz(String oras) {
        this.oras = oras;
    }

    public BuilderAutobuz setModel(String model) {
        this.model = model;
        return this;
    }

    public BuilderAutobuz setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public BuilderAutobuz setHasOpririCapatLinie(boolean hasOpririCapatLinie) {
        this.hasOpririCapatLinie = hasOpririCapatLinie;
        return this;
    }

    public BuilderAutobuz setHasSolicitareDeschidereUsi(boolean hasSolicitareDeschidereUsi) {
        this.hasSolicitareDeschidereUsi = hasSolicitareDeschidereUsi;
        return this;
    }

    public BuilderAutobuz setHasTextEcranDerulant(boolean hasTextEcranDerulant) {
        this.hasTextEcranDerulant = hasTextEcranDerulant;
        return this;
    }

    public static BuilderAutobuz getInstance(String oras){
        if(instance == null){
            instance = new BuilderAutobuz(oras);
        }
        return instance;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(model,numeSofer,hasOpririCapatLinie,hasSolicitareDeschidereUsi,hasTextEcranDerulant);
    }

    public void descriere(){
        System.out.println("Autobuzul circula prin orasul "+ oras);
    }
}
