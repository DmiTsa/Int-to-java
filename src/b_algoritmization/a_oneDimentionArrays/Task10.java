package b_algoritmization.a_oneDimentionArrays;

import java.util.Arrays;

public class Task10 {
    /*
 Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
  */
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 2, 14, 12, -5, 1, -2};
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
