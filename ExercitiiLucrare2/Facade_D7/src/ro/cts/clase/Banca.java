package ro.cts.clase;

public class Banca {
    public void creareCont(Client client){
        Operator operator = new Operator();
        if(operator.verificareVarstaPersoana(client)){
            if(!client.esteUrmaritDePolitie()){
                if(!client.areCreateLaAlteBanci()){
                    System.out.println("Cont creat cu succes!");
                }else {
                    System.out.println("Are creante la alte banci!");
                }
            }
            else {
                System.out.println("Este urmarit de politie!");
            }
        }else
        {
            System.out.println("Imposibil de creat contul!");
        }
    }
}
