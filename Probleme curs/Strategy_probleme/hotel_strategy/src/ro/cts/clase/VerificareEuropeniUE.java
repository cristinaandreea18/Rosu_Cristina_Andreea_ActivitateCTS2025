package ro.cts.clase;

public class VerificareEuropeniUE implements ModVerificare {
    @Override
    public void verificareActe(String nume) {
        System.out.println("Am verificat buletinul lui "+nume);
    }
}
