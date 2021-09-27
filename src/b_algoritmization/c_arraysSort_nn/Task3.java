package b_algoritmization.c_arraysSort_nn;

import java.util.Arrays;

public class Task3 {
    /*
 Сортировка выбором. Дана последовательность чисел a1,a2, ..., an. Требуется переставить элементы так,
 чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 повторяется. Написать алгоритм сортировки выбором.
  */
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 1, 69, -7, 4, -56, 36};

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int ind = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    ind = j;
                    max = arr[j];
                }
            }
            int tmp = arr[i];
            arr[i] = max;
            arr[ind] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
