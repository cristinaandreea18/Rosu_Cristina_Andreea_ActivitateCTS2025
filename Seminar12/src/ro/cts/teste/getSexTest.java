package ro.cts.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.cts.clase.Persoana;
import ro.cts.exceptii.ExceptieCNPInvalid;

import static org.junit.Assert.*;

public class getSexTest {

    @Test
    public void getSexRIGHTM(){
        Persoana persoana = new Persoana("Ion","5020124051418");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void getSexRIGHTF(){
        Persoana persoana = new Persoana("Maria","6001213875319");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void getSexBoundaryI(){
        Persoana persoana = new Persoana("Viorel","1980101171826");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void getSexBoundaryS(){
        Persoana persoana = new Persoana("Ioana","8941012348719");
        assertEquals("F",persoana.getSex());
    }


    private String getSexParitate(String CNP){
        if(CNP.charAt(0)%2==0){
            return  "F";
        }
        else {
            return "M";
        }
    }

    @Test
    public void getSexCrossCheck(){
        String CNP="1980101171826";
        Persoana persoana = new Persoana("Vasile",CNP);
        assertEquals(getSexParitate(CNP),persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getSexError(){
        Persoana persoana = new Persoana("Ion","9031116851613");
        persoana.getSex();
    }
}