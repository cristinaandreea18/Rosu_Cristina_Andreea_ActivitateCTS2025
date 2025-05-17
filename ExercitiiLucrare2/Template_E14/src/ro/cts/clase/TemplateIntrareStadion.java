package ro.cts.clase;

public abstract class TemplateIntrareStadion {
    public final void accesStadion(Bilet bilet){
        {
            asezareLaCoada();
            if(prezentareBilet(bilet)){
                if(controlCorporal()){
                    intrarePeStadion();
                    ocupareLoc();
                }else {
                    System.out.println("Trebuie realizat controlul corporal si al bagajelor!");
                }
            }
            else {
                System.out.println("Trebuie sa prezentati biletul!");
            }
        }
    }
     abstract boolean asezareLaCoada();
     abstract boolean prezentareBilet(Bilet bilet);
     abstract boolean controlCorporal();
     abstract void intrarePeStadion();
     abstract void ocupareLoc();

}
