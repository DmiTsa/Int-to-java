package b_algoritmization.sort.p1;

import java.util.Arrays;

/*
 Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 10, 10, 10};
        int k = 3;

        int arrLen = arr1.length;
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr1, k, arr1, k+arr2.length, arrLen-k);
        System.arraycopy(arr2, 0, arr1, k, arr2.length);

        System.out.println(Arrays.toString(arr1));
    }
}