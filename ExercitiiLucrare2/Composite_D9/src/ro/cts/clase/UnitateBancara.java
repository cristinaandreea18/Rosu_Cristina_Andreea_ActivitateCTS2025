package ro.cts.clase;

public abstract class UnitateBancara {
    protected String denumireUnitate;

    public UnitateBancara(String denumireUnitate) {
        this.denumireUnitate = denumireUnitate;
    }


    public abstract void adaugaUnitateBancara(UnitateBancara unitateBancaraDeAdaugat)throws Exception;
    public abstract void stergeUnitateBancara(UnitateBancara unitateBancaraDeSters)throws Exception;
    public abstract void descriereUnitateBancara();
    public abstract UnitateBancara getUnitateBancara(int cheie)throws Exception;
}
