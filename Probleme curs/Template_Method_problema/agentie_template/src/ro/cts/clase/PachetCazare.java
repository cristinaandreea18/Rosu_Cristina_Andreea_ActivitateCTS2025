package ro.cts.clase;

public class PachetCazare extends PachetTuristic {
    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cautareCazare(int codPachet) {
        System.out.println("S-a cautat cazare pentru pachetul cu codul "+codPachet);
    }

    @Override
    public void cautareTransport(int codPachet) {
    }

    @Override
    public void rezervaPachet(int codPachet) {
        System.out.println("S-a rezervat pachetul cu codul "+codPachet);
    }

    @Override
    public void platirePachet(int codPachet) {
        System.out.println("S-a platit pachetul cu codul "+codPachet);
    }
}
