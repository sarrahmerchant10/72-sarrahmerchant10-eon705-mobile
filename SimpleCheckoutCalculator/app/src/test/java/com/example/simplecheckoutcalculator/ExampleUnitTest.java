package com.example.simplecheckoutcalculator;

import org.junit.Test;
import android.content.Context;


import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Calculations calculations = new Calculations();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkTax() {
        calculations.incrementHat();
        calculations.incrementNecklace();
        calculations.updateSubtotal();
        calculations.updateTax();
        double total = calculations.updateTotal();
        assertEquals(46.33, total, 1e-15);
    }
}
