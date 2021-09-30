package b_algoritmization.d_decompos;

public class Task15 {
    /*
     Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int n = 2; //значность

        int minNumber = (int) Math.pow(10, n-1);
        int maxNumber = (int) Math.pow(10, n);
       for (int i = minNumber; i < maxNumber; i++) {
            if (isIncrease(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static int countDigits(int x) {
        int d = 0;
        double del = 10;
        while (del > 1) {
            del = x / Math.pow(10, d);
            d++;
        }
        return d - 1;
    }

    private static boolean isIncrease(int x) {
        int n = countDigits(x);
        int[] array = new int[n];   //массив цифр числа
        String nString = String.valueOf(x); //строковое представление числа
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(String.valueOf(nString.charAt(i)));
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]){
                flag = false;
                break;
            };
        }
        return flag;
    }
}
