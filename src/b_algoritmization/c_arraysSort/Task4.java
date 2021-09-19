package b_algoritmization.c_arraysSort;

import java.util.Arrays;

public class Task4 {
    /*
 Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа. Если an>an+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
    public static void main(String[] args) {
        int[] arr = {8, 6, 78, -5, -3, 50, 12, 37};

        int rejCount = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    rejCount++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сделано "+ rejCount + " перестановок");
    }
}
