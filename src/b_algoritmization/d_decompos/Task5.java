package b_algoritmization.d_decompos;

public class Task5 {
    /*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
    public static void main(String[] args) {
        int[] array = {4, 8, 6, 1, 5, 3, 7};  //отв 7
        System.out.println(preMaxOfArray(array));

    }

    private static int preMaxOfArray(int[] array) {
        int max = array[0];
        int preMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > preMax && array[i] != max) {
                preMax = array[i];
            }
        }
        return preMax;
    }
}
