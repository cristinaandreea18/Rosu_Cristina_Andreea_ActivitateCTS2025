package ro.cts.clase;

public class Linie implements AbstractLinie {
    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int numarLinie, String primaStatie, String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("numarLinie=").append(numarLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void circula(Autobuz autobuz) {
        System.out.println(autobuz.toString()+ " circula pe linia cu numarul "+numarLinie+" avand ruta " + primaStatie+"-"+ultimaStatie);
    }
}
