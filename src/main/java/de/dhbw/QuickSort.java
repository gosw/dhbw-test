package de.dhbw;

public class QuickSort {

    public static int[] sortieren(int[] liste){
        qSort(liste, 0, liste.length - 1);
        return liste;
    }

    private static void qSort(int[] list, int left, int right){
        if (left < right) {
            int i = partition(list, left, right);
            qSort(list, left, i-1);
            qSort(list, i + 1, right);
        }
    }

    private static int partition(int[] list, int left, int right){
        int pivot = list[right];
        int i = left;
        int j = right - 1;
        int help;
        while (i <= j){
            if (list[i] > pivot){
                //tausche list[i] und list[j]
                help = list[i];
                list[i] = list[j];
                list[j] = help;
                j--;
            } else {
                i++;
            }
        }
        // tausche x[i] und x[rechts]
        help = list[i];
        list[i] = list[right];
        list[right] = help;

        return i;
    }
}