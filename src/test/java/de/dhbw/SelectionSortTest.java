package de.dhbw;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testSortieren() throws Exception {
        int[] liste = new int[]{0, 8, 6, 7, 1, 9, 3, 2, 5, 4};
        int[] correctListe = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(correctListe, SelectionSort.selectionsort(liste));
    }
}