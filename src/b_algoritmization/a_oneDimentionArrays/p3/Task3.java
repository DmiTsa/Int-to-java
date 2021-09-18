package b_algoritmization.a_oneDimentionArrays.p3;

import java.lang.reflect.Array;

/*
 Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        //int[] arr = new int[]{5, 7, 8, 12, 1};
        int[] arr = new int[]{-54, -12, 0, -4, 2, 5, 6, 6, 0, 82};
        int countPos = 0, countNeg = 0, countZero = 0;
        for (int ar : arr) {
            if (ar == 0)
                countZero++;
            else if (ar > 0)
                countPos++;
            else
                countNeg++;
        }
        countZero = Array.getLength(arr) - countPos - countNeg;
        System.out.println("Положительных элементов: " + countPos);
        System.out.println("Отрицательных элементов: " + countNeg);
        System.out.println("Нулевых элементов: " + countZero);
    }
}
