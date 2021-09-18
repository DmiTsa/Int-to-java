package b_algoritmization.a_oneDimentionArrays;

import java.util.Arrays;

public class Task7 {
    /*
 Даны действительные числа а1...an. Найти max ( a1 + 2an, an + a(n+1), ...  an + a(n-1) )
 кол-во членов должно быть нечетное.
  */
    public static void main(String[] args) {
        int[] arr = {5, 41, 1, 27, 4};
        int[] arrNew = new int[arr.length];
        int midRow = arr.length / 2 + 1;    //номер среднего числа ряда

        for (int i = 1; i < arr.length; i++) {
            if ((i % 2 == 0) & (i < midRow)) {   //не четные до середины
                arrNew[i] = arr[i] + arr[i + 1];
            }
            if ((i % 2 != 0) & (i < midRow)) {   //четные до середины
                arrNew[i] = arr[i] + arr[i + 1];
            }
            if ((i % 2 == 0) & (i >= midRow)) {
                arrNew[i] = arr[i] + arr[i - 1];   //не четные после середины
            }
            if ((i % 2 != 0) & (i >= midRow)) {
                arrNew[i] = arr[i] + arr[i - 1];   //четные после середины
            }
        }
        arrNew[0] = arr[0] + 2 * arr[arr.length - 1];
        int max = arrNew[0];
        for (int i = 1; i < arrNew.length; i++) {
            if (arrNew[i] >= max) {
                max = arrNew[i];
            }
        }
        System.out.println("Главый массив = " + Arrays.toString(arrNew));
        System.out.println("Максимальный элемент = " + max);
    }
}
