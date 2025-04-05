package ro.cts.clase;

public class SupaLegume extends Supa {
    public SupaLegume(String timpDePreparare, float pret, float gramaj) {
        super(timpDePreparare, pret, gramaj);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de legume este preparata in " + getTimpDePreparare()+", prezinta un gramaj de "+getGramaj()+" si costa "+ getPret());
    }
}
