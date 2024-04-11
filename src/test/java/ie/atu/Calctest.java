package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calctest {
    Calc newCalc;
    Calc newCalc2;
    Calc newCalc3;
    Calc newCalc4;

    @Test
    void testAdd(){
       newCalc = new Calc();
       assertEquals(10,newCalc.add(6,4));

    }

    @Test
    void testSub(){
        newCalc2 = new Calc();
        assertEquals(2,newCalc.Sub(6,4));

    }

    @Test
    void testDiv(){
        newCalc3 = new Calc();
        assertEquals(5,newCalc.Div(10,2));

    }

    @Test
    void testMulti(){
        newCalc4 = new Calc();
        assertEquals(12,newCalc.Multi(6,2));

    }
}
