package b_algoritmization.a_oneDimentionArrays;

public class Task3 {
    /*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
    public static void main(String[] args) {
        int[] arr = {-54, -12, 0, -4, 2, 5, 6, 6, 0, 82};
        int countPos = 0, countNeg = 0, countZero = 0;
        for (int ar : arr) {
            if (ar == 0) {
                countZero++;
            }
            if (ar > 0) {
                countPos++;
            }
            if (ar < 0) {
                countNeg++;
            }
        }
        System.out.println("Положительных элементов: " + countPos);
        System.out.println("Отрицательных элементов: " + countNeg);
        System.out.println("Нулевых элементов: " + countZero);
    }
}
