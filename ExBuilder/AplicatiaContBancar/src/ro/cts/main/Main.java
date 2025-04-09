package ro.cts.main;

import ro.cts.clase.ContBancar;
import ro.cts.clase.ContBancarBuilder;

public class Main {
    public static void main(String[]args){
        ContBancarBuilder builder = new ContBancarBuilder();
        ContBancar contBancar = builder.setDetinator("Ilie").setMoneda("ron").setSuma(1000).setHasContSalariu(true).setHasCardAtasat(true).setHasInternetBanking(true).build();
        ContBancar contBancar2 = builder.setDetinator("Ion").build();
        System.out.println(contBancar);
        System.out.println(contBancar2);
    }
}
