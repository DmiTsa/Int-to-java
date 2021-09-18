package b_algoritmization.sort.p2;

import java.util.Arrays;

/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Main_var2 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 8, 16};  // {1 2 4 8 16 0 0 0 0 } J переменная
        int[] arr2 = {1, 9, 10, 15};

        int arr1Nlength = arr1.length;
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);  //увеличили 1й массив для вставки 2го
        System.arraycopy(arr2, 0, arr1, arr1Nlength, arr2.length);

        for (int i = 0; i < arr1.length; i++) {
            int min = arr1[i];
            int pos = i;
            for (int j = i; j < arr1.length; j++) {
                if (arr1[j] < min) {
                    pos = j;
                    min = arr1[pos];
                }
            }
            arr1[pos] = arr1[i];
            arr1[i] = min;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
