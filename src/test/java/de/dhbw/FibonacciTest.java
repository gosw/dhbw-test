package de.dhbw;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testGetFib() throws Exception {
        assertEquals("Test Fib", 1, Fibonacci.getFib());
    }
}