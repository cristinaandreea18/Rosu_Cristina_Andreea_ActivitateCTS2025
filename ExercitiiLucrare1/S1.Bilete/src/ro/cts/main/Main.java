package ro.cts.main;

import ro.cts.clase.Bilet;
import ro.cts.clase.BiletPrototype;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){
        Set<Integer> locuri = new HashSet<>();
        locuri.add(13);
        locuri.add(14);
        locuri.add(15);
        Bilet bilet = new BiletPrototype("film","regie","actor","companie","descriere",true,"11.04.2025",22,locuri);
        System.out.println(bilet);
        Bilet bilet2 = bilet.clone("30.09.2025",15,locuri);
        System.out.println(bilet2);

    }
}
