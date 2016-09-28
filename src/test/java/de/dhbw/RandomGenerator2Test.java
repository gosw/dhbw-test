package de.dhbw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GAUDICHT on 28.09.2016.
 */
public class RandomGenerator2Test {
    @Test
    public void korrektePrimzahlenTest() throws Exception {
        int anzahl=(int)Math.random()*10;
        assertEquals(anzahl,RandomGenerator2.randomZahlen(anzahl).length);
    }
}
