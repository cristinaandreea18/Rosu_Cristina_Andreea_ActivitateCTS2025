package ro.cts.clase;

public class UsaFacade {
    private SistemUsa sistem;

    public UsaFacade(SistemUsa sistem) {
        this.sistem = sistem;
    }

    public void deschidereaTuturorUsilorLaSolicitare(){
        sistem.getUsaFata().deschidereLaSolicitare();
        sistem.getUsaMijloc().deschidereLaSolicitare();
        sistem.getUsaSpate().deschidereLaSolicitare();
    }

    public void deschidereaTuturorUsilorFortata(){
        sistem.getUsaFata().deschidereFortata();
        sistem.getUsaMijloc().deschidereFortata();
        sistem.getUsaSpate().deschidereFortata();
    }
}
