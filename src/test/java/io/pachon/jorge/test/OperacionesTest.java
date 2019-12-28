package io.pachon.jorge.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones oP;

    @Before
    public void setup(){
        oP = new Operaciones();
    }

    @Test
    public void sumaTest(){

        Assert.assertEquals("El resultado de suma no es acorde",11, oP.suma(5,6));
    }
    @Test
    public void restaTest(){

        Assert.assertEquals("El resultado de resta no es acorde",3, oP.resta(5,2));
    }
    @Test
    public void multiplicacionTest(){

        Assert.assertEquals("El resultado de multiplicacion no es acorde",28, oP.multiplicacion(7,4));
    }
    @Test
    public void restaDivision(){

        Assert.assertEquals("El resultado de division no es acorde",5, oP.division(25,5));
    }
}
