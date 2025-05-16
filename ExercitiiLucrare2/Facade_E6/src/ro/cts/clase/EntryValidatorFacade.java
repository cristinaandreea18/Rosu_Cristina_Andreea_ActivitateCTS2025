package ro.cts.clase;

public class EntryValidatorFacade {
    TicketVerifier bilet = new TicketVerifier();
    PoliceChecker politie = new PoliceChecker();
    StadiumBlackListChecker stadion = new StadiumBlackListChecker();
    public void validareIntrare(String serieBuletin,String codBilet){
        if(bilet.esteBiletulValid(codBilet,serieBuletin)){
            if(!politie.esteCautatDePolitie(serieBuletin)){
                if(!stadion.areAntecedentePeStadion(serieBuletin)){
                    System.out.println("Are acces pe stadion");
                }
                else {
                    System.out.println("Nu este permisa intrarea");
                }
            }
            else {
                System.out.println("Este cautat de politie");
            }
        }else
        {
            System.out.println("Biletul nu este inregistrat folosind acel buletin");
        }
    }
}
