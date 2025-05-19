package ro.cts.clase;

public class ProcesatorTaxa implements IProcesatorCerere {
    private IProcesatorCerere next;
    @Override
    public void setNext(IProcesatorCerere next) {
        this.next=next;
    }

    @Override
    public void proceseaza(Cerere cerere) {
        if(cerere.getCategorie().equals("taxa")){
            System.out.println("Taxa procesata:"+cerere);
        }else
            if(next!=null){
                next.proceseaza(cerere);
            }
            else{
                System.out.println("Nu se poate procesa nicio cerere");
            }
    }
}
