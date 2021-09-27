package b_algoritmization.d_decompos;

import java.util.Arrays;

public class Task10 {
    /*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N
     */
    public static void main(String[] args) {
        int n = 875404;
        int size = 6;

        int[] array = new int[size];
        String nString = String.valueOf(n);
        for (int i = 0; i < size; i++) {
          array[i] = charToInt( nString.charAt(i) );
        }

        System.out.println(Arrays.toString(array));

    }
    public  static int charToInt (char ch){
        return Integer.parseInt(String.valueOf(ch));
    }

}

