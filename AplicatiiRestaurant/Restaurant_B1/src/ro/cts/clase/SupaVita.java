package ro.cts.clase;

import ro.cts.clase.Supa;

public class SupaVita extends Supa {
    public SupaVita(String timpDePreparare, float pret, float gramaj) {
        super(timpDePreparare, pret, gramaj);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de vita este preparata in " + getTimpDePreparare()+", prezinta un gramaj de "+getGramaj()+" si costa "+ getPret());
    }
}
