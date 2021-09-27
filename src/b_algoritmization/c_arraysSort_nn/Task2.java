package b_algoritmization.c_arraysSort_nn;

import java.util.Arrays;

public class Task2 {
    /* Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn . Образовать из них новую последовательность
        чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
        */
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 8, 16};
        int[] arr2 = {1, 9, 10, 15};

        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);  //увеличили 1й массив для вставки 2го
        for (int i = 0; i < arr2.length; i++) {  //берем каждый элемент 2го массива чтобы прогнать по 1му
            for (int j = 0; j < arr1.length - 1; j++) {
                if (((arr2[0] < arr1[0]) || (arr2[i] >= arr1[j])) && ((arr2[i] <= arr1[j + 1]) || (arr1[j + 1] == 0))) {
                    System.arraycopy(arr1, j + 1, arr1, j + 2, (arr1.length - j - 2));//сдвиг
                    if (arr2[0] < arr1[0]) {
                        arr1[1] = arr1[0];
                        arr1[0] = arr2[0];
                    } else arr1[j + 1] = arr2[i];
                    j = arr2.length + 3;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
//вариант 2 с System.arraycopy
/*
public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 8, 16};
        int[] arr2 = {1, 9, 10, 15};

        int arr1Nlength = arr1.length;
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
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
    }*/
