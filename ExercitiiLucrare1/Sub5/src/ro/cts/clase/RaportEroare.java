package ro.cts.clase;

public class RaportEroare extends AbstractRaport implements TestReport {
    public RaportEroare(float timpExecutieTest, String comportament, String coliziune) {
        super(timpExecutieTest, comportament, coliziune);
    }

    @Override
    public void raportareTest() {

    }
}
