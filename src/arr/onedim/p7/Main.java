package arr.onedim.p7;

import java.util.Arrays;

/*
Даны действительные числа а1...an.
Найти max ( a1 + 2an, an + a(n+1), ...  an + a(n-1) )
кол-во членов должно быть нечетное
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 41, 1, 27, 4};
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
        System.out.println("Глвый массив = " + Arrays.toString(arrNew));
        System.out.println("Максимальный элемент = " + max);
    }
}
