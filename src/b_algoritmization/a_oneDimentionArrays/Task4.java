package b_algoritmization.a_oneDimentionArrays;

import java.util.Arrays;

public class Task4 {
    //Даны действительные числа а1, а2, ... ,аn. Поменять местами наибольший и наименьший элементы.
    public static void main(String[] args) {
        int[] array = {50, -500, 65, -5, 412, 6, -8, 1};
        int minIndex = 0, maxIndex = 0; //индексы min max элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxIndex])
                maxIndex = i;
            if (array[i] <= array[minIndex])
                minIndex = i;
        }
        int tmp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = tmp;

        System.out.println(Arrays.toString(array));
    }
}