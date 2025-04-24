package ro.cts.clase;

public class Receptionist {

    public String poateLuaLocLaMasa(Masa masa){
        Ospatar o = new Ospatar();
        Picolo p = new Picolo();

        if(masa.isEsteLibera()){
            if(p.esteDebarasata(masa)){
                if(o.esteAranjata(masa)){
                   return "Va rog sa luati loc la masa " + masa.getNrMasa();
                }
                else {
                    return "Asteptati putin sa aranjam masa";
                }
            }
            else {
                return "Asteptati tocmai s-a asezat cineva";
            }
        }else
        {
            return "Momentan masa "+masa.getNrMasa()+" nu este disponibila";
        }
    }
}
