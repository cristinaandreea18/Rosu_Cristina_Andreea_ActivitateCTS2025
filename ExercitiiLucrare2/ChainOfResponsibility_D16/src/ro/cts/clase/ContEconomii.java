package ro.cts.clase;

public class ContEconomii extends Cont {

    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void plateste(float suma) {
        if(suma<sold){
            sold-=suma;
            System.out.println("S-a platit suma de "+suma+" RON din contul de economii");
            System.out.println("A mai ramas suma de "+sold);
        }else
        {
            if(urmatorul!=null){
                urmatorul.plateste(suma);
            }
        }
    }
}
