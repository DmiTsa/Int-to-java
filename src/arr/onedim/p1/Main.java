package arr.onedim.p1;

import java.util.Scanner;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 45, 7, 19, 6, 48, 47, 77, 61};
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число кратности (К) ");
        int k = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
