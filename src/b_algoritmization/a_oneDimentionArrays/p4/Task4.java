package b_algoritmization.a_oneDimentionArrays.p4;

import java.util.Arrays;

/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{50, -500, 65, -5, 412, 6, -8, 1};
        int nMin = 0, nMax = 0; //индексы min max элементов
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[nMax])
                nMax = i;

            if (arr[i] <= arr[nMin])
                nMin = i;
        }
        int tmp = arr[nMax];
        arr[nMax] = arr[nMin];
        arr[nMin] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}