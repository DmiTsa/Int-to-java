package b_algoritmization.a_oneDimentionArrays.p6;
/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 6, 78, 41, -5, 41, 2, 10, -9, -78, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrm(i)) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов = " + sum);
    }
    public static boolean isPrm(int n) {
        boolean f = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                f = false;
                break;
            }
        }
        return f;
    }
}

