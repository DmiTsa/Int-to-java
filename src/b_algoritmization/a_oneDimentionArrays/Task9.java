package b_algoritmization.a_oneDimentionArrays;

public class Task9 {
    /*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
*/
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 18, 9, 20, 4, 6, 20};

        int maxCount = 0;
        int[] countElement = new int[arr.length];   //составление массива повторяемости элементов
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) countElement[i]++;
            }
            if (countElement[i] >= maxCount) { //вычисление максимального кол-ва повторений максимального эл-та
                maxCount = countElement[i];
            }
        }

        //for (int i = 0; i < arr.length; i++) {
        //   if (arr[i] <= arr[0]) {
        //        min = arr[i];
        //    }
        // }
        int min = 0;       // выбор первого из повторяющихся элементов
        for (int i = 0; i < arr.length; i++) {
            if (countElement[i] == maxCount) {
                min = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((countElement[i] == maxCount) && (arr[i] < min)) {
                min = arr[i];
            }
        }
        System.out.println("Самое минимальное повторяющееся = " + min);
    }
}
