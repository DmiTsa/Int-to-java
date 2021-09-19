package b_algoritmization.c_arraysSort.p5nn;

import java.util.Arrays;

public class Main {
    /*
Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность,
т. е. a1 <= a2 <= ... ai. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
не будут перебраны.
Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 6, 78, 52, 17, 16, 7, 1};
        int pointer = 0; //сдвинуть от поз установки вперед членов ( i - поз уст)
        int tmp;
        for (int i = 1; i < array.length; i++) {
            pointer = pointOut(array, i);
            tmp = array[i];
            for (int j = i; j > pointer; j--) {
                array[j] = array[j - 1];
            }
            array[pointer] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int pointOut(int[] array, int pos) { //pos=6
//сортировка последовательности из массива array от 0 до позиции pos-1 {5, 8, 9, 14, 20,25,21  отв 4
        int element = array[pos]; //21
        int min = 0;
        int max = pos - 1;//5
        int mid = 1;
        while (min < max) {//min 5  max 5
            mid = (min + max) / 2;//mid 4
            if (element == array[mid]) { //21
                break;
            } else if (element > array[mid]) {//21 > 20
                min = mid + 1;
            } else if (element < array[mid]) {//true
                max = mid - 1; //max = 1
            }
        }
        return mid;//1
    }
}

