package ro.cts.clase;

public class Filiala extends UnitateBancara {
    public Filiala(String denumireUnitate) {
        super(denumireUnitate);
    }

    @Override
    public void adaugaUnitateBancara(UnitateBancara unitateBancaraDeAdaugat) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void stergeUnitateBancara(UnitateBancara unitateBancaraDeSters) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void descriereUnitateBancara() {
        System.out.println("Filiala "+denumireUnitate);
    }

    @Override
    public UnitateBancara getUnitateBancara(int cheie) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Filiala{");
        sb.append("denumireUnitate='").append(denumireUnitate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
