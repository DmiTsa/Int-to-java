package z_referenceCode;

import java.util.Arrays;

public class BubleSort {


    public static void main(String[] args) {
        int[] arr = {5, 12, 6, 8, 7, 3, 4, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
