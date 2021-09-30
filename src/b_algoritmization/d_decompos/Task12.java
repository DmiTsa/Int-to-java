package b_algoritmization.d_decompos;

import java.util.Arrays;

public class Task12 {
    /*
    Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
     */
    public static void main(String[] args) {
        int k = 2; //сумма цифр массива равна k
        int n = 4; // числа не больше n
        int[] array = new int[getSizeArray(k, n)];

        int num = k;
        for (int i = 0; i < array.length; i++) {
            if (num > n) {
                array[i] = n;
                num -= n;
            } else {
                array[i] = num;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int getSizeArray(int number, int max) {
        int size = 0;
        if (number % max == 0) {
            size = number / max;
        } else {
            size = (number / max) + 1;
        }
        return size;
    }
}

