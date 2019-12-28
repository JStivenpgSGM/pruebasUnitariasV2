package io.pachon.jorge.test;

import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class CadenaTest {

    private Cadena cD;

    @Before
    public void setUp() throws Exception {
        cD = new Cadena();
    }

    public void concatenar(){
        String esperado = "Pedro Perez";
        Assert.assertEquals("No es lo esperado",cD.concatenar("Pedro","Perez") );
    }
}