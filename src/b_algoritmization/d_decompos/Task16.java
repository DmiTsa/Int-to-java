package b_algoritmization.d_decompos;

public class Task16 {
    /*
    Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int n = 4;

        int minNumber = (int) Math.pow(10, n - 1);
        int maxNumber = (int) Math.pow(10, n);
        int sum = 0;
        for (int i = minNumber; i < maxNumber; i++) {
            if (isAllDigitsOdd(i)) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных цифр = " + sum);
        System.out.println("Количество четных цифр = " + digitsEven(sum));
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

    private static boolean isAllDigitsOdd(int x) {
        int n = countDigits(x);
        int[] array = new int[n];   //массив цифр числа
        String nString = String.valueOf(x); //строковое представление числа
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(String.valueOf(nString.charAt(i)));
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static int digitsEven(int x) {
        int n = countDigits(x);
        int[] array = new int[n];   //массив цифр числа
        String nString = String.valueOf(x); //строковое представление числа
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(String.valueOf(nString.charAt(i)));
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
