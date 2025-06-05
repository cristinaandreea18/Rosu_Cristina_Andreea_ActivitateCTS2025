package ro.cts.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.cts.categorii.CategorieBoundary;
import ro.cts.categorii.CategorieRight;
import ro.cts.clase.IPersoana;
import ro.cts.clase.Persoana;
import ro.cts.exceptii.ExceptieCNPInexistent;
import ro.cts.exceptii.ExceptieCNPInvalid;

import static org.junit.Assert.*;

public class getVarstaTest {
    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    @Category(CategorieRight.class)
    public void getVarstaRIGHT() {
        persoana = new Persoana("Andrei","5031115065412");
        assertEquals(21,persoana.getVarsta());
    }

    @Test
    @Category(CategorieRight.class)
    public void gestVarstaRIGHT2(){
        persoana = new Persoana("Ioana","2740914361319");
        assertEquals(50,persoana.getVarsta());
    }

    @Test
    @Category(CategorieBoundary.class)
    public void getVarstaBoundary(){
        persoana = new Persoana("Alina","2991231987614");
        assertEquals(25,persoana.getVarsta());
    }

    @Test
    @Category(CategorieBoundary.class)
    public void getVarstaBoundary2(){
        persoana = new Persoana("Mihai","5000101651419");
        assertEquals(25,persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareCaractere(){
        persoana = new Persoana("Adrian","50001x6y1478");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareLuna(){
        persoana = new Persoana("Mirel","5001301651478");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance(){
        persoana = new Persoana("Alin","6031117041267");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExistance(){
        persoana = new Persoana("Ion",null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        persoana = new Persoana("Ionel","5240101786514");
        assertEquals(1,persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality2(){
        persoana = new Persoana("Ionel","5250101786514");
        assertEquals(0,persoana.getVarsta());
    }

    @Test
    @Category(CategorieRight.class)
    public void getVarstaRight(){
        IPersoana persoana = new Persoana("Andreea","2980213876543");
        assertEquals(27,persoana.getVarsta());
    }

    @Test
    @Category({CategorieBoundary.class, CategorieRight.class})
    public void getVarstaBoundary3(){
        IPersoana persoana1 = new Persoana("Ion","5000101897654");
        assertEquals(25,persoana1.getVarsta());
    }
}