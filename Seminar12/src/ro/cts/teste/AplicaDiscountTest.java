package ro.cts.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.cts.categorii.CategorieBoundary;
import ro.cts.categorii.CategorieRight;
import ro.cts.clase.IPersoana;
import ro.cts.clase.PachetTuristic;
import ro.cts.dubluri.PersoanaFake;
import ro.cts.dubluri.PersoanaStub;

import static org.junit.Assert.*;

public class AplicaDiscountTest {

    @Test
    @Category(CategorieBoundary.class)
    public void aplicaDiscountVarstniciBoundaryTest() {
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai",500.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(425,pachetTuristic.getPret(),0.001);
    }

    @Test
    @Category(CategorieRight.class)
    public void aplicaDissountVarstnicRightOverTest(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(80);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"India",600.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(510,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstniciRightUnderTest(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(64);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"India",200.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(200,pachetTuristic.getPret(),0.01);
    }
}