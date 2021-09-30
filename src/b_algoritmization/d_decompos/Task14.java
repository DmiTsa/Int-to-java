package b_algoritmization.d_decompos;

public class Task14 {
    /*
        Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.  xxx = x(n) + x(n) +x(n)
         */
    public static void main(String[] args) {
        int k = 9999;
        for (int i = 1; i <= k; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + ", ");
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

    private static boolean isArmstrong(int x) {
        int n = countDigits(x); //вычисляет кол-во цифр в числе
        int[] array = new int[n];   //массив цифр числа
        String nString = String.valueOf(x); //строковое представление числа
        int sum =0;
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(String.valueOf(nString.charAt(i)));
            sum += Math.pow(array[i],n);
        }
        return (sum == x);
    }
}
