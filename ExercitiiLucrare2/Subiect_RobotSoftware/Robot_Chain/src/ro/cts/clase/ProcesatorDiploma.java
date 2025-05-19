package ro.cts.clase;

public class ProcesatorDiploma implements IProcesatorCerere {
    private IProcesatorCerere next;
    @Override
    public void setNext(IProcesatorCerere next) {
        this.next= next;
    }

    @Override
    public void proceseaza(Cerere cerere) {
        if(cerere.getCategorie().equals("diploma")){
            System.out.println("Diploma procesata:"+cerere);
        }else
            if(next!=null){
                next.proceseaza(cerere);
            }
            else{
                System.out.println("Nu a putut sa fie procesata nicio cerere!");
            }
    }
}
