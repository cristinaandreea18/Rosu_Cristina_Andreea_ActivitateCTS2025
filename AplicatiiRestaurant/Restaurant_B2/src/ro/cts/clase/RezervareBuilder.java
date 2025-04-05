package ro.cts.clase;

public class RezervareBuilder implements Builder {
    public Rezervare rezervare;

    public RezervareBuilder(String nume,String data){
        rezervare = new Rezervare(nume,data,false,false,false,false,"ambientala");
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }

    public RezervareBuilder setHasAsezareLaGeam(boolean val) {
        rezervare.setHasAsezareLaGeam(val);
        return this;
    }

    public RezervareBuilder setHasScauneErgonomice(boolean val) {
        rezervare.setHasScauneErgonomice(val);
        return this;
    }

    public RezervareBuilder setHasDecorareMasa(boolean val) {
        rezervare.setHasDecorareMasa(val);
        return this;
    }

    public RezervareBuilder setHasMuzicaAmbientala(boolean val) {
        rezervare.setHasMuzicaAmbientala(val);
        return this;
    }

    public RezervareBuilder setGenMuzica(String val) {
        rezervare.setGenMuzica(val);
        return this;
    }

}
