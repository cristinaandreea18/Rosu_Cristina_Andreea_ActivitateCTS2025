package ro.cts.clase;

public class Medicament {
    private String nume;
    private int cantitateDisponibila;

    public Medicament(String nume, int cantitateDisponibila) {
        this.nume = nume;
        this.cantitateDisponibila = cantitateDisponibila;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cantitateDisponibila=").append(cantitateDisponibila);
        sb.append('}');
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }

    public int getCantitateDisponibila() {
        return cantitateDisponibila;
    }

    public boolean esteDispnibil(int cantitateDorita){
        if(cantitateDorita<cantitateDisponibila){
            cantitateDisponibila-=cantitateDorita;
            System.out.println("A ramas in stoc pentru medicamentul "+ nume+ " un numar de "+cantitateDisponibila);
            return true;
        }else {
            return false;
        }
    }
}
