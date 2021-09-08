package arr.onedim.p9;

import java.util.Scanner;
/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
*/

public class Main {
    public static int[] getArrayInt() {
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArrayInt();
        int maxCount = 0;

        int[] countElement = new int[arr.length];   //составление массива повторяемости элементов и вычисление максимального
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) countElement[i]++;
            }
            if (countElement[i] >= maxCount) {
                maxCount = countElement[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[0]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((countElement[i] == maxCount) && (arr[i] <= min)) {
                System.out.println("Самое минимальное повторяющееся = " + min);
            }
        }
    }
}
