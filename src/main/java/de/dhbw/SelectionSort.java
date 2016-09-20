package de.dhbw;

public class SelectionSort {

    public static int[] selectionsort(int[] sortieren) {
        for (int i = 0; i < sortieren.length - 1; i++) {
            for (int j = i + 1; j < sortieren.length; j++) {
                if (sortieren[i] > sortieren[j]) {
                    int temp = sortieren[i];
                    sortieren[i] = sortieren[j];
                    sortieren[j] = temp;
                }
            }
        }

        return sortieren;
    }

}