package ro.cts.main;

import ro.cts.clase.SistemUsa;
import ro.cts.clase.UsaFacade;

public class Main {
    public static void main(String[] args){
        SistemUsa sistem = new SistemUsa();
        UsaFacade facade = new UsaFacade(sistem);

        facade.deschidereaTuturorUsilorLaSolicitare();
        facade.deschidereaTuturorUsilorFortata();
    }
}
