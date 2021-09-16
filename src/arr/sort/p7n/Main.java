package arr.sort.p7n;

import java.util.Arrays;

/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=..an и b1<=b2<=...<=bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 = {-50, -4, 6, 19, 28, 46, 79};   // ответ: позиции № 0 3 5 6
        int[] array2 = {-50, 20, 34, 81};

        int[] arrPos = new int[(array2.length)];
        for (int i = 0; i < array2.length; i++) {     //перебор второго массива
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    arrPos[i] = j;
                    j= array1.length;
                }
                if (    ((array2[i] <= array1[j-1]) && (j !=0)) && (j != array2.length-1) &&((array2[i] >= array1[j+1])  )   ) {// добавить условия краев
                    arrPos[i] = j;
                    j= array1.length;
                }
            }

        }
        System.out.println(Arrays.toString(arrPos));
    }
}
