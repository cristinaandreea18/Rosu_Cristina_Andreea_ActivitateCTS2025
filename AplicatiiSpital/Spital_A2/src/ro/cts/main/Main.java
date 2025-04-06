package ro.cts.main;

import ro.cts.clase.PersonalSpital;
import ro.cts.clase.factory.FabricaSpital;
import ro.cts.clase.factory.TipPersonalSpital;

public class Main {
    public static void main(String[] args){
        FabricaSpital fabricaSpital = new FabricaSpital("Grigore Alexandrescu");
        PersonalSpital medic = fabricaSpital.getPersonalSpital(TipPersonalSpital.MEDIC,"Ion",7000,5);
        PersonalSpital brancardier = fabricaSpital.getPersonalSpital(TipPersonalSpital.BRANCARDIER,"Gigel",4000,6);
        PersonalSpital asistent = fabricaSpital.getPersonalSpital(TipPersonalSpital.ASISTENT,"Dorel",5000,5);

        medic.descrie();
        brancardier.descrie();
        asistent.descrie();

    }
}
