package ro.cts.clase;

public class AbstractRaport {
    private float timpExecutieTest;
    private String comportament;
    private String coliziune;

    public AbstractRaport(float timpExecutieTest, String comportament, String coliziune) {
        this.timpExecutieTest = timpExecutieTest;
        this.comportament = comportament;
        this.coliziune = coliziune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRaport{");
        sb.append("timpExecutieTest=").append(timpExecutieTest);
        sb.append(", comportament='").append(comportament).append('\'');
        sb.append(", coliziune='").append(coliziune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
