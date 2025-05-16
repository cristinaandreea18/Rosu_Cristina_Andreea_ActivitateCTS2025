package ro.cts.clase;

public class BiletSimplu implements Bilet {
    private String echipaGazda;
    private String echipaOaspete;

    public BiletSimplu(String echipaGazda, String echipaOaspete) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
    }

    @Override
    public void printare() {
        System.out.println("Bilet pentru meciul: " + echipaGazda + " vs " + echipaOaspete);
    }


}
