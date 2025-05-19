package ro.cts.clase;

public class ProcesatorAdeverinta implements IProcesatorCerere {
    private IProcesatorCerere next;
    @Override
    public void setNext(IProcesatorCerere next) {
        this.next=next;
    }

    @Override
    public void proceseaza(Cerere cerere) {
        if(cerere.getCategorie().equals("adeverinta")){
            System.out.println("Adeverinta procesata: "+cerere);
        }
        else {
            if(next!=null){
                next.proceseaza(cerere);
            }else
            {
                System.out.println("Nu s-a putut procesa");
            }
        }
    }
}
