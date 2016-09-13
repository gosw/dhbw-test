package de.dhbw;

public class Primzahlen {
    public static boolean primzahlenTesten(int zahl) {

        for(int i=2; i<zahl/2; i++) {
            if (zahl%i==0){
               return false;
            }
        }
        return true;
    }
}
