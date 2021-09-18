package b_algoritmization.a_oneDimentionArrays;

public class Task8 {
    /*
 Дана последовательность целых чисел a1, a2, ... an. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min (a1, a2, ... an).
 */
    public static void main(String[] args) {
        int[] array = {7, -5, 50, 40, -5, 15};
        int min = array[0];
        for (int ar : array) {   //поиск значения минимального элемента
            if (ar <= min) {
                min = ar;
            }
        }
        int n = 0;
        for (int ar : array)    //определение количества минимальных
            if (ar == min) n++;

        int[] newArr = new int[array.length - n];   //новый массив без min элементов
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                newArr[j] = array[i];
                j++;
            }
        }
        System.out.println("Исходный массив");
        for (int ar : array) System.out.print(ar + " ");
        System.out.println();
        System.out.println("Новый массив");
        for (int ar : newArr) System.out.print(ar + " ");
    }
}
