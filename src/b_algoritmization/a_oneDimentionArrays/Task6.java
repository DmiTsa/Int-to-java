package b_algoritmization.a_oneDimentionArrays;

public class Task6 {
    /*
  Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
  являются простыми числами.
   */
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 1, 10, 1, 10, 1, 1, 1};
        int sum = 0;
        boolean flag;

        for (int i = 0; i < arr.length; i++) {
            flag=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов = " + sum);
    }
}

