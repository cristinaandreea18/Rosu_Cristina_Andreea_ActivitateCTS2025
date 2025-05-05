package ro.cts.clase;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("CatAirLines");
        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare,orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie,orasPlecare);

        Hotel hotel = new Hotel("Cat Hotel");
        System.out.println(zborDus);
        System.out.println(zborIntors);
        hotel.rezervaCamera(orasDestinatie);
    }
}
