package ro.cts.main;

import ro.cts.clase.IAutobuz;
import ro.cts.clase.OprireAutobuz;
import ro.cts.clase.OprireAutobuzNocturn;

public class Main {
    public static void main(String[] args){
        IAutobuz autobuz = new OprireAutobuz();
        IAutobuz autobuzNocturn= new OprireAutobuzNocturn(autobuz);
        autobuzNocturn.opresteInStatie("X123","Mihai Viteazul",5);
        autobuzNocturn.opresteInStatie("X567","Obor",0);
    }
}
