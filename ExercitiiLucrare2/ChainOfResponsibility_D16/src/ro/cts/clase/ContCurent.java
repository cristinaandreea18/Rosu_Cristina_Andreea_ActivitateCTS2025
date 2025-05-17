package ro.cts.clase;

public class ContCurent extends Cont {
    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void plateste(float suma) {
        if(suma<sold){
            sold-=suma;
            System.out.println("Plata de "+suma+ " realizata din contul curent");
            System.out.println("A mai ramas suma de "+sold);
        }
        else
        {
           if(urmatorul!=null){
               urmatorul.plateste(suma);
           }
        }
    }
}
