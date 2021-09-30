package b_algoritmization.d_decompos;

public class Task17 {
    /*
     Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int number = 2000;

        int count=0;
        do {
            number -= sumDigits(number);
            count++;
        } while (number>0);

        System.out.println( count);

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

    private static int sumDigits(int x) {
        int n = countDigits(x);
        int[] array = new int[n];   //массив цифр числа
        String nString = String.valueOf(x); //строковое представление числа
        int sum=0;
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(String.valueOf(nString.charAt(i)));
            sum +=array[i];
        }
        return sum;
    }
}
