package ro.cts.clase;

public class Operator {
    public boolean verificareVarstaPersoana(Client client){
        if(client.getVarsta()>=18){
            System.out.println("Se permite crearea contului pentru clientul "+client.getNume());
            return true;
        }
        else {
            return false;
        }
    }
}
