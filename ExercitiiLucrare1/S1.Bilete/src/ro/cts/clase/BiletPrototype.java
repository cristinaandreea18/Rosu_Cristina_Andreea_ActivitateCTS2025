package ro.cts.clase;

import java.util.Set;

public class BiletPrototype extends Bilet {
    public BiletPrototype(String titlu, String regie, String actorPrincipal, String companieProducatoare, String scurtaDescriere, boolean areReclame, String data, int ora, Set<Integer> locuriOcupate) {
        super(titlu, regie, actorPrincipal, companieProducatoare, scurtaDescriere, areReclame, data, ora, locuriOcupate);
    }

    public BiletPrototype(){
        super();
    }

    @Override
    public Bilet clone(String data, int ora, Set<Integer> locuriOcupate) {
        Bilet bilet = new BiletPrototype();
        bilet.titlu = this.titlu;
        bilet.actorPrincipal = this.actorPrincipal;
        bilet.scurtaDescriere = this.scurtaDescriere;
        bilet.regie = this.regie;
        bilet.areReclame = this.areReclame;
        bilet.companieProducatoare = this.companieProducatoare;
        bilet.data = data;
        bilet.ora = ora;
        bilet.locuriOcupate = locuriOcupate;
        return bilet;
    }
}
