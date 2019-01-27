package day5.sorting;

import java.util.Arrays;

public class BubbleSort {
    static int[] tablica = {4, 2, 8, 1, 3, 9, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tablica));
        bubbleSort();
        System.out.println("************");
        System.out.println(Arrays.toString(tablica));

    }

    private static void bubbleSort() {
        int t = tablica.length;
        for (int i = 0; i < t-1; i++) {
            System.out.println(Arrays.toString(tablica));
            for (int j = 0; j < t - 1 - i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int k = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = k;
                }
                System.out.println();
                System.out.println(Arrays.toString(tablica));
            }
        }
    }
}