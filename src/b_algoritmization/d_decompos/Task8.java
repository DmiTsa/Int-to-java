package b_algoritmization.d_decompos;

import java.util.Arrays;

public class Task8 {
    /*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. ??? D[l] + D[2] + D[3]; D[2] + D[3] + D[4]; D[4] +D[5] +D[6] ???
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
     */
    public static void main(String[] args) {
        //промежуток исходного массива
        int[] array = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int k = 0;
        int m = 8;
        int n = m - k - 2; //кол-во сумм
        int[] sumS = new int[n];
        for (int i = 0; i < sumS.length; i++) {
            sumS[i] = threeSum(array, k + i);
        }
        System.out.println(Arrays.toString(sumS));
    }

    private static int threeSum(int[] array, int k) {
        return array[k] + array[k + 1] + array[k + 2];
    }
}
