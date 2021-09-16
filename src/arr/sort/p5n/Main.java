package arr.sort.p5n;

import java.util.Arrays;
/*
5. Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть - упорядоченная последовательность, т. е.
a1  a2  an
. Берется следующее число
ai+1
и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, -8, 78, 52, 17, 16, 7, 1};

        int[] sortedArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            System.arraycopy(array, 0, sortedArray, 0, i);

            //int pos = binSort(sortedArray, array[i]);
        }
    }

    public static int binSort(int[] array) {     //{-8, 1, 5, 8', 52, 78} elem =17  mid=3
        int midIndex = array.length / 2;
     //   while (array[midIndex] < element) {

        //}
    //    while (array[midIndex] > element) {

       //}
        return array[0];
    }
}

