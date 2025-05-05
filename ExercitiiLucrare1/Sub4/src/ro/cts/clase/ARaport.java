package ro.cts.clase;

public class ARaport implements AbstractAirQualityReport {
    private float PM2_5; //valoareNivelParfticule
    private float temperatura;
    private String dataMasurare;

    public ARaport(float PM2_5, float temperatura, String dataMasurare) {
        this.PM2_5 = PM2_5;
        this.temperatura = temperatura;
        this.dataMasurare = dataMasurare;
    }

    public float getPM2_5() {
        return PM2_5;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public String getDataMasurare() {
        return dataMasurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ARaport{");
        sb.append("PM2_5=").append(PM2_5);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", dataMasurare='").append(dataMasurare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void prezintaSituatie() {
        System.out.println("Situatia privind calitatea aerului din data de: "+getDataMasurare()+ ",la temperatura "+getTemperatura()+" si un nivel de particule fine "+getPM2_5());
    }
}
