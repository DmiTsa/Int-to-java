package b_algoritmization.c_arraysSort.p5nn;

import java.util.Arrays;

public class Main_v2 {
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
        int[] array = {5, 7, 6, 9, 10, 52, 17, 16, 7, 1}; //0 1 2 3 pos - номер i
       for (int i=1; i < array.length; i++){
           System.out.println("элемент = "+ array[i]+" место "+ pointOut(array,i));
       }
    }

    private static int pointOut(int[] array, int i) {
        int element = array[i];
        int pos = i;
        int minIndex = 0;
        int maxIndex = pos - 1;

        while (minIndex <= maxIndex) {
            int mid = (minIndex + maxIndex) / 2;

            if (element > array[mid]) {
                minIndex = mid + 1;
                pos = mid + 1;
            } else if (element < array[mid]) {
                maxIndex = mid - 1;
                pos = mid + 1;
            } else if (element == array[mid]) {
                pos = mid + 1;
                break;
            }
        }
        return pos;
    }
}
