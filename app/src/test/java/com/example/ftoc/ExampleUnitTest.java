package com.example.ftoc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    double f_freeze = 32;
    double c_freeze = 0;
    double f_boil = 212;
    double c_boil = 100;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void fToC_isCorrect() {
        assertEquals(Utilities.fToC(f_freeze), c_freeze, 0.001);
        assertEquals(Utilities.fToC(f_boil), c_boil, 0.001);
    }

    @Test
    public void cToF_isCorrect() {
        assertEquals(Utilities.cToF(c_freeze), f_freeze, 0.001);
        assertEquals(Utilities.cToF(c_boil), f_boil, 0.001);
        assertEquals(Utilities.cToF(-40),-40, 0.001);
    }
}

