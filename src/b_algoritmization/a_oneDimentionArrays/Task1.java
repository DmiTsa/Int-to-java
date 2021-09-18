package b_algoritmization.a_oneDimentionArrays;

public class Task1 {
    //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
    public static void main(String[] args) {
        int[] arrayA = {4, 20, 16, 35, 17, 21, 5};
        int k = 5;
        int sum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % k == 0) {
                sum += arrayA[i];
            }
        }
        System.out.println("Сумма чисел, кратных " + k + " равна " + sum);
    }
}
