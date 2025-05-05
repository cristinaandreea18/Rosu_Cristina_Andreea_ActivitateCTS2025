package ro.cts.clase;

public abstract class ComponentaAuto implements IComponenta {
    private String culoare;
    private float greutate;

    public ComponentaAuto(String culoare, float greutate) {
        this.culoare = culoare;
        this.greutate = greutate;
    }

    public String getCuloare() {
        return culoare;
    }

    public float getGreutate() {
        return greutate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComponentaAuto{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append(", greutate=").append(greutate);
        sb.append('}');
        return sb.toString();
    }
}
