package ro.cts.clase;

public class ProxyInternare implements AbstractInternare {

    private AbstractInternare internare;

    public ProxyInternare(AbstractInternare internare) {
        this.internare = internare;
    }

    @Override
    public void internare(Pacient pacient) {
        if(pacient.getNumarAsigurareMedicala()!=null){
            this.internare.internare(pacient);
        }
        else {
            System.out.println("Nu se poate realiza internarea fara asigurare medicala!");
        }
    }
}
