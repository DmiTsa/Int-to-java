package arr.onedim.p9n;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Main {
    public static int[] getArrayInt(char print) {
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (print == 'y') System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArrayInt('y');

    }
}

