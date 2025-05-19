package ro.cts.clase;

import ro.cts.inchieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata implements PachetTuristic {
    private MasinaInchiriata masinaInchiriata;

    public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descrire() {
        System.out.println(this.masinaInchiriata.toString());
    }

    @Override
    public void rezervaPachet() {
        this.masinaInchiriata.inchiriazaMasina();
    }
}
