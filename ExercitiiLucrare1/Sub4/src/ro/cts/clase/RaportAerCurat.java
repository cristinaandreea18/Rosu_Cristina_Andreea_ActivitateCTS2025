package ro.cts.clase;

public class RaportAerCurat extends ARaport implements AbstractAirQualityReport {
    public RaportAerCurat(float PM2_5, float temperatura, String dataMasurare) {
        super(PM2_5, temperatura, dataMasurare);
    }

    @Override
    public void prezintaSituatie() {
        System.out.println("Situatie caracterizata printr-un raport de aer curat, data de: "+getDataMasurare()+ ",la temperatura "+getTemperatura()+" si un nivel de particule fine "+getPM2_5());
    }
}
