package ro.cts.clase;

public class ContBancarBuilder implements Builder{
    private ContBancar contBancar;

    public ContBancarBuilder(){
         contBancar = new ContBancar();
    }
    @Override
    public ContBancar build() {
        return contBancar;
    }

    public ContBancarBuilder setDetinator(String detinator) {
        contBancar.setDetinator(detinator);
        return this;
    }

    public ContBancarBuilder setSumaBlocata(double sumaBlocata) {
        contBancar.setSumaBlocata(sumaBlocata);
        return this;
    }

    public ContBancarBuilder setSuma(double suma) {
        contBancar.setSuma(suma);
        return this;
    }

    public ContBancarBuilder setMoneda(String moneda) {
        contBancar.setMoneda(moneda);
        return this;
    }

   public ContBancarBuilder setHasCardAtasat(boolean val){
        contBancar.setCardAtasat(val);
        return this;
   }

   public ContBancarBuilder setHasContSalariu(boolean val){
        contBancar.setContSalariu(val);
        return this;
   }

   public ContBancarBuilder setHasInternetBanking(boolean val){
        contBancar.setInternetBanking(val);
        return this;
   }
}
