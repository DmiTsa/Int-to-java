package z_referenceCode;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {5,8,9,10,1,97,20,17};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
    }
}
