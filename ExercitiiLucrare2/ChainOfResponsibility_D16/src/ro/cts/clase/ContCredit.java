package ro.cts.clase;

public class ContCredit extends Cont {
    public ContCredit(float sold) {
        super(sold);
    }

    @Override
    public void plateste(float suma) {
        if(suma<sold){
            sold-=suma;
            System.out.println("S-a platit suma de "+suma+" RON din contul de credit");
            System.out.println("A mai ramas suma de "+sold);

        }
        else {
            System.out.println("Nu s-a putut realiza plata");
        }
    }
}
