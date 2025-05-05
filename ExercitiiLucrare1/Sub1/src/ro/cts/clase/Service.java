package ro.cts.clase;

public class Service implements IService {

    private String denumire;
    private int nrAngajati;
    private String locatie;

    private AMasina masinaInService = null;
    private static Service instance = null;

    private Service(String denumire, int nrAngajati,String locatie) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
        this.locatie = locatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public static Service getInstance(String denumire, int nrAngajati, String locatie){
        if(instance == null){
            instance = new Service(denumire,nrAngajati,locatie);
        }
        return  instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Service{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public synchronized void reparaMasina(AMasina masina,String problema) {
        if(masinaInService == null) {
            try{
                Thread.sleep(3000);
            this.masinaInService = masina;
            System.out.println("Masina lui "+masinaInService.getProprietar() + " a intrat in service  pentru "+problema );
            this.masinaInService = null;
            System.out.println("Masina " + "a iesit din in service");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
