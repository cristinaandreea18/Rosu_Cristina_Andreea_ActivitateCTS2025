package ro.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament extends RetetaPrototype {
    public String denumireMedicament;
    public Map<String,Double> cantitatiSolutii = new HashMap<>();

    public RetetaMedicament(String numeChimist,String codReteta,String denumireMedicament,Map<String,Double>cantitatiSolutii) {
        super(numeChimist, codReteta);
        this.denumireMedicament = denumireMedicament;
        this.cantitatiSolutii = cantitatiSolutii;
    }

    public RetetaMedicament(){
        super();
    }
    @Override
    public RetetaPrototype clone(String denumireMedicament) {
        RetetaMedicament retetaMedicament = new RetetaMedicament();
        retetaMedicament.codReteta = this.codReteta;
        retetaMedicament.numeChimist = numeChimist;
        retetaMedicament.denumireMedicament = denumireMedicament;
        retetaMedicament.cantitatiSolutii = this.cantitatiSolutii;
        return retetaMedicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaMedicament{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", cantitatiSolutii=").append(cantitatiSolutii);
        sb.append(", numeChimist='").append(numeChimist).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
