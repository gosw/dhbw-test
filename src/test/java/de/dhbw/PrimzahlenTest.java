package de.dhbw;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Torsten on 06.09.2016.
 */
public class PrimzahlenTest {
    @Test
    public void primzahlenBerechnen() throws Exception {
        assertEquals("Zahl nicht korrekt",10,Primzahlen.primzahlenBerechnen());
    }

}