package de.dhbw;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Torsten on 06.09.2016.
 */
public class PrimzahlenTest {
    @Test
    public void korrektePrimzahlenTest() throws Exception {
        assertEquals("Primzahl als nicht Primzahl definiert",true,Primzahlen.primzahlenTesten(17));
    }

    @Test
    public void falschePrimzahlenTest() throws Exception {
        assertEquals("Zahl faelschlicherweise als Primzahl definiert",false,Primzahlen.primzahlenTesten(10));
    }

}