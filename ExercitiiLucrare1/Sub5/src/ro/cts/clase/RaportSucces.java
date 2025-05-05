package ro.cts.clase;

public class RaportSucces extends AbstractRaport implements TestReport {
    public RaportSucces(float timpExecutieTest, String comportament, String coliziune) {
        super(timpExecutieTest, comportament, coliziune);
    }

    @Override
    public void raportareTest() {

    }
}
