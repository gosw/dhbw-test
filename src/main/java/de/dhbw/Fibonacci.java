package de.dhbw;

public class Fibonacci {

    public static int getFib(final int n)
    {
        if (n <= 2) {
            return (n > 0) ? 1 : 0;
        }
        return getFib(n - 1) + getFib(n - 2);
    }

}