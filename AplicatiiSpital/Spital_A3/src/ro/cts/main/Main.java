package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[]args){
        FabricaPersonalMedical fabricaPersonalMedical = new FabricaPersonalMedical(10);
        FabricaPersonalNonMedical fabricaPersonalNonMedical = new FabricaPersonalNonMedical(8);
        PersonalSpital medic = fabricaPersonalMedical.createPersonalSpital(PersonalMedical.MEDIC,"Ion",9000);
        System.out.println(medic);
        PersonalSpital secretar = fabricaPersonalNonMedical.createPersonalSpital(PersonalNonMedical.SECRETAR,"Gigel",5000);
        System.out.println(secretar);

    }
}
