package b_algoritmization.decompos;

import java.util.Arrays;

public class Task10n {
    /*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N
     */
    public static void main(String[] args) {
        int n = 875404;

        int size = sizeDec(n);
        int[] array = new int[size];
        for (int i = 1; i <= size; i++) {
            array[i - 1] = decimalRest(n / Math.pow(10, i));
        }
        System.out.println(Arrays.toString(array));

    }

    private static int decimalRest(double x) { //8.7
        x = Math.round((x % 1) * 10);
        return (int) x;
    }

    private static int sizeDec(int x) { //000/x
        int d = 0;
        double del = 10;
        while (del > 1) {
            del = x / Math.pow(10, d);
            d++;
        }
        return d - 1;
    }
}

