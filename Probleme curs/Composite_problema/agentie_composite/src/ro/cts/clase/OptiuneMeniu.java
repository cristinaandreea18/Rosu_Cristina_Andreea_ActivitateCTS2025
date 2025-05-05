package ro.cts.clase;

public interface OptiuneMeniu {
   void adaugaOptiune(OptiuneMeniu optiune) throws Exception;
   void stergeOptiune(OptiuneMeniu optiune) throws Exception;
   void descriere() ;
   OptiuneMeniu getOptiune(int pozitie) throws Exception;

}
