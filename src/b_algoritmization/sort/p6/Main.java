package b_algoritmization.sort.p6;

import java.util.Arrays;

/*
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
на один элемент вперед. Если ai >= ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 56, -7, 6, -2, 80};
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i<=0) {
                    i =0;
                } else {
                    i = i - 2;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
