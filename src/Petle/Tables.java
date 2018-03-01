package Petle;

import java.util.Arrays;

/*
1. Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
2. Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby.
 */
public class Tables {

    //Ad.1
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    //Ad.2
    public static int[] sortBubble(int[] a) {
        int tmp;
        for (int n = a.length; n > 0; n--) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
        return a;
    }


}
