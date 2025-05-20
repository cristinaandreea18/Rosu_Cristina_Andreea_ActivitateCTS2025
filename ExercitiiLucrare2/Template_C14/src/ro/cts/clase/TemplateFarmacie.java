package ro.cts.clase;


import java.util.HashMap;
import java.util.Map;

public abstract class TemplateFarmacie {
    public abstract void primesteReteta(Reteta reteta);
    public abstract boolean verificareMedicamenteInStoc(Medicament medicament,int cantitateDorita);
    public abstract boolean aducereMedicamenteDinDepozit(Medicament medicament);
    public abstract void realizarePlata();
    public abstract void reducereCantitateDepozit(Medicament medicament,int cantitateDorita);
    public abstract void emitereBon();

    public final void proceduraAchizitieMedicamente(Reteta reteta){
        Boolean permitePlata= true;
        primesteReteta(reteta);
        HashMap<Medicament,Integer> listaMedicamente = reteta.getListaMedicamente();
        for(Map.Entry<Medicament,Integer>entry: listaMedicamente.entrySet()){
            Medicament medicament = entry.getKey();
            int cantitateDorita = entry.getValue();

            if(verificareMedicamenteInStoc(medicament,cantitateDorita)){
                aducereMedicamenteDinDepozit(medicament);
                reducereCantitateDepozit(medicament,cantitateDorita);
            }else {
                permitePlata=false;
                System.out.println("Cantitatea solicitata nu este disponibila pentru medicamentul "+medicament.getDenumire());
            }
        }
        if(permitePlata==true){
            realizarePlata();
            emitereBon();
        }
        else {
            System.out.println("Nu a fost permisa plata!");
        }
    }

}
