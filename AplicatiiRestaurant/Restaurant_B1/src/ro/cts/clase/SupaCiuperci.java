package ro.cts.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(String timpDePreparare, float pret, float gramaj) {
        super(timpDePreparare, pret, gramaj);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de ciuperci este preparata in " + getTimpDePreparare()+", prezinta un gramaj de "+getGramaj()+" si costa "+ getPret());
    }
}
