package ro.cts.clase;

public class RaportAvertizare extends AbstractRaport implements TestReport {
    public RaportAvertizare(float timpExecutieTest, String comportament, String coliziune) {
        super(timpExecutieTest, comportament, coliziune);
    }

    @Override
    public void raportareTest() {

    }
}
