package ro.cts.clase;

public class BicicletaMTB extends ABicicleta implements IBicicleta {
    private String marca;

    public BicicletaMTB(String marca, double pretVanzare, float dimensiuneRoti) {
        super(pretVanzare, dimensiuneRoti);
        this.marca = marca;
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta MTB  vanduta de "+ marca+ " are rotile de dimensiunea "+getDimensiuneRoti()+" si se vinde la pretul de "+getPretVanzare());
    }
}
