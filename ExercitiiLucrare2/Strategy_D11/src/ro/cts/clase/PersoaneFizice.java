package ro.cts.clase;

public class PersoaneFizice implements TipClient {
    @Override
    public void verificareActe() {
        System.out.println("Se solicita doar buletinul si adeverinta de munca!");
    }
}
