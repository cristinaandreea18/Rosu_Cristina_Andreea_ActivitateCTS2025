package ro.cts.clase;

import java.util.List;
import java.util.ArrayList;

public class Facade {
    public String poateSaFieInternat(Pacient p){
        Medic m = new Medic("Ion","Caritas");
        Salon s1 = new Salon(3,5,2);
        Salon s2 = new Salon(7,7,3);
        List<Salon> saloane = new ArrayList<>();
        saloane.add(s1);
        saloane.add(s2);
        Spital s = new Spital("Caritas",saloane);
        if(m.verificareConfirmareMedic(p)){
            if(s.verificareDisponibilitateSaloane()){
                return "Medicul a confirmat internarea si exista pat in salon!";
            }
            else {
                return "Nu exista loc in salon!";
            }
        }
        else {
            return "Medicul a refuzat internarea!";
        }
    }
}
