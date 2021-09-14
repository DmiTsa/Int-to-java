package arr.sort.p2;

import java.util.Arrays;

/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Main_var1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 8, 16};  // {1 2 4 8 16 0 0 0 0 } J переменная
        int[] arr2 = {1, 9, 10, 15};

        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);  //увеличили 1й массив для вставки 2го
        for (int i = 0; i < arr2.length; i++) {  //берем каждый элемент 2го массива чтобы прогнать по 1му
            for (int j = 0; j < arr1.length - 1; j++) {
                if (((arr2[0]<arr1[0])||(arr2[i] >= arr1[j])) && ((arr2[i] <= arr1[j + 1]) || (arr1[j + 1]==0) )) {
                    System.arraycopy(arr1, j+1, arr1,j + 2, (arr1.length - j-2));//сдвиг
                    if (arr2[0]<arr1[0]) {
                        arr1[1] = arr1[0];
                        arr1[0] = arr2[0];
                    } else arr1[j+1] = arr2[i];
                    j= arr2.length+3;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
