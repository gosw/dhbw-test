package de.dhbw;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testGetFibErste() throws Exception {
        assertEquals(1, Fibonacci.getFib(1));
    }

    @Test
    public void testGetFibZweite() throws Exception {
        assertEquals(1, Fibonacci.getFib(2));
    }

    @Test
    public void testGetFibDritte() throws Exception {
        assertEquals(2, Fibonacci.getFib(3));
    }

    @Test
    public void testGetFibVierte() throws Exception {
        assertEquals(3, Fibonacci.getFib(4));
    }

    @Test
    public void testGetFibFuenfte() throws Exception {
        assertEquals(5, Fibonacci.getFib(5));
    }

    @Test
    public void testGetFibSechste() throws Exception {
        assertEquals(8, Fibonacci.getFib(6));
    }

    @Test
    public void testGetFibSiebte() throws Exception {
        assertEquals(13, Fibonacci.getFib(7));
    }

    @Test
    public void testGetFibAchte() throws Exception {
        assertEquals(21, Fibonacci.getFib(8));
    }
    
}