package ro.cts.clase;

public class SenzorPerimetral implements RoboticArmConnection{
    private float razaActivare;

    private static SenzorPerimetral instance = null;
    private SenzorPerimetral(float razaActivare) {
        this.razaActivare = razaActivare;
    }

    public static SenzorPerimetral getInstance(float razaActivare){
        if(instance == null){
            return new SenzorPerimetral(razaActivare);
        }
        return instance;
    }

    @Override
    public void descriere() {
        System.out.println("S-a realizat conexiune la senzor perimetral");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SenzorPerimetral{");
        sb.append("razaActivare=").append(razaActivare);
        sb.append('}');
        return sb.toString();
    }
}
