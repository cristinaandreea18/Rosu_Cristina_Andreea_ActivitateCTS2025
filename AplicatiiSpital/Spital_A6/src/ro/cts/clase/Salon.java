package ro.cts.clase;

public class Salon {
    private int nrSalon;
    private int nrPaturiDisponibile;

    private int nrPaturiOcupate;

    public Salon(int nrSalon, int nrPaturiDisponibile, int nrPaturiOcupate) {
        this.nrSalon = nrSalon;
        this.nrPaturiDisponibile = nrPaturiDisponibile;
        this.nrPaturiOcupate = nrPaturiOcupate;
    }

    public boolean verificareDisponibilitatePaturi(){
        if(nrPaturiOcupate<nrPaturiDisponibile){
           return ocupaLocSalon();
        }
        else {
            return false;
        }
    }

    public boolean ocupaLocSalon(){
        this.setNrPaturiOcupate(this.getNrPaturiOcupate()+1);
        return true;
    }

    public int getNrPaturiOcupate() {
        return nrPaturiOcupate;
    }

    public void setNrPaturiOcupate(int nrPaturiOcupate) {
        this.nrPaturiOcupate = nrPaturiOcupate;
    }
}
