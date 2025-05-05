package ro.cts.clase;

public class ItemMeniu implements OptiuneMeniu {
    private String numeItem;

    public ItemMeniu(String numeItem) {
        this.numeItem = numeItem;
    }

    @Override
    public void adaugaOptiune(OptiuneMeniu optiune)throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeOptiune(OptiuneMeniu optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("Descriere ITEM "+numeItem);
    }

    @Override
    public OptiuneMeniu getOptiune(int pozitie)throws Exception {
        throw new Exception("NU este implementata");
    }

}
