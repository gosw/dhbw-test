package de.dhbw;

/**
 * Created by GAUDICHT on 28.09.2016.
 */
public class randomGenerator {

    public static int[] randomZahlen(int zahl)
    {
        int[] zufallszahlen=new int[zahl];
        int temp;
        for(int i=0; i<zahl;i++) {
            temp = (int) Math.random() * 10;
            zufallszahlen[i]=temp;
            System.out.println(zufallszahlen[i]);
        }

        return zufallszahlen;
    }

}
