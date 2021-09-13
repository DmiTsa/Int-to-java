package arr.sort.p2n;

import java.util.Arrays;

/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 16};
        int[] arr2 = {3, 9, 10, 21, 100};

        int arr1Length = arr1.length;
        int ch = arr1.length;

        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if ((arr2[i] >= arr1[j]) && ((arr2[i] <= arr1[j + 1]) | (arr1[j + 1] == 0))) {
                    System.arraycopy(arr1, j + 1, arr1, j + 2, arr1Length-j-1);     //сдвигаем массив на 1 вперед
                    System.arraycopy(arr2, i, arr1, j + 1, 1);      //копируем новый символ из arr2 в arr1
                    break;
                }
            }
        }

        //
        System.out.println(Arrays.toString(arr1));
    }
}
