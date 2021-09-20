package b_algoritmization.c_arraysSort;

public class Task7 {
    /*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=..an и b1<=b2<=...<=bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
    public static void main(String[] args) {
        int[] array1 = {-50, -4, 6, 19, 28, 46, 79};
        int[] array2 = {20, 34, 80};

        int pos = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 1; j < array1.length - 2; j++) {
                if (array2[i] >= array1[j - 1] && array2[i] <= array1[j + 1]) {
                    System.out.println("Элемент " + array2[i] + " на место " + j);
                    break;
                }
            }
            if (array2[i] <= array1[0]) {
                System.out.println("Элемент " + array2[i] + " на место 1");
            } else if (array2[i] >= array1[array1.length - 1]) {
                System.out.println("Элемент " + array2[i] + " на место " + (array1.length - 1));
            }
        }
    }
}
