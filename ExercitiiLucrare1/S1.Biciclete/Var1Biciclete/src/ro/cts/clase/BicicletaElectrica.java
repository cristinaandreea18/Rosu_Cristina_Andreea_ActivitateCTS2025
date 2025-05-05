package ro.cts.clase;

public class BicicletaElectrica extends ABicicleta implements IBicicleta {
    private String marca;

    public BicicletaElectrica(String marca,double pretVanzare, float dimensiuneRoti) {
        super(pretVanzare, dimensiuneRoti);
        this.marca = marca;
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta Electrica  vanduta de "+ marca+ " are rotile de dimensiunea "+getDimensiuneRoti()+" si se vinde la pretul de "+getPretVanzare());
    }
}
