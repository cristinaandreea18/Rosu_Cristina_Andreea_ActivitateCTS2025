package ro.cts.clase;

import java.time.LocalDate;

public abstract class RetetaPrototype {
    protected String numeChimist;
    protected String codReteta;

    public RetetaPrototype(String numeChimist, String codReteta) {
        if(numeChimist.length()>0) {
            this.numeChimist = numeChimist;
        }
        else {
            this.numeChimist = "Anonim";
        }

        if(codReteta.length()<6){
            this.codReteta = "X1X2X3";
        }
        else
        {
            this.codReteta = codReteta;
        }
    }

    public RetetaPrototype() {
        this.codReteta ="X1X2X3";
        this.numeChimist ="Ion";
    }

    public abstract RetetaPrototype clone(String denumireMedicament);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaPrototype{");
        sb.append("numeChimist='").append(numeChimist).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
