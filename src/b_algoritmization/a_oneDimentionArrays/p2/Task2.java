package b_algoritmization.a_oneDimentionArrays.p2;

import java.util.Arrays;
import java.util.Scanner;

/*
Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 8, 12, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Z");
        int z = sc.nextInt();
        System.out.println("Начальный массив");
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println("Новый массив");
        System.out.println(Arrays.toString(arr));
        System.out.println("Замен " + count);

    }
}
