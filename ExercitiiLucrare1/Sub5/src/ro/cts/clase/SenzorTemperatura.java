package ro.cts.clase;

public class SenzorTemperatura implements RoboticArmConnection {
    private float temperaturaDeActivare;
    private static SenzorTemperatura instance = null;

    private SenzorTemperatura(float temperaturaDeActivare) {
        this.temperaturaDeActivare = temperaturaDeActivare;
    }

    public static SenzorTemperatura getInstance(float temperaturaDeActivare){
        if(instance == null){
            return new SenzorTemperatura(temperaturaDeActivare);
        }
        return instance;
    }

    @Override
    public void descriere() {
        System.out.println("S-a realizat conexiune la senzor temperatura");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SenzorTemperatura{");
        sb.append("temperaturaDeActivare=").append(temperaturaDeActivare);
        sb.append('}');
        return sb.toString();
    }
}
