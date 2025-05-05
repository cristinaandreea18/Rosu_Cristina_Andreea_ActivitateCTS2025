package ro.cts.clase;

public class Bicicleta implements IBicicleta {
    private String marca;
    private int nrViteze;
    private float diametruRoti;
    private String tipFrana;
    private boolean hasCascaProtectie;
    private boolean hasOchelari;

    public Bicicleta(String marca, int nrViteze, float diametruRoti, String tipFrana, boolean hasCascaProtectie, boolean hasOchelari) {
        this.marca = marca;
        this.nrViteze = nrViteze;
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.hasCascaProtectie = hasCascaProtectie;
        this.hasOchelari = hasOchelari;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNrViteze(int nrViteze) {
        this.nrViteze = nrViteze;
    }

    public void setDiametruRoti(float diametruRoti) {
        this.diametruRoti = diametruRoti;
    }

    public void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }

    public void setHasCascaProtectie(boolean hasCascaProtectie) {
        this.hasCascaProtectie = hasCascaProtectie;
    }

    public void setHasOchelari(boolean hasOchelari) {
        this.hasOchelari = hasOchelari;
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta a fost creata de firma: "+marca+ " si prezinta: nr viteze:"+nrViteze+",diametru roti:"+diametruRoti+",tip de frana:"+tipFrana);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrViteze=").append(nrViteze);
        sb.append(", diametruRoti=").append(diametruRoti);
        sb.append(", tipFrana='").append(tipFrana).append('\'');
        sb.append(", hasCascaProtectie=").append(hasCascaProtectie);
        sb.append(", hasOchelari=").append(hasOchelari);
        sb.append('}');
        return sb.toString();
    }
}
