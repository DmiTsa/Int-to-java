package arr.multidim.p13n;

import java.util.Arrays;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Main {
    public static void main(String[] args) {
        int n = 4; //порядок матрицы
        int matrix[][] = {{4, 8, 6, 7},
                {7, 1, 3, 3},
                {9, 8, 7, 2},
                {6, 4, 5, 8}};
        System.out.println("Сортировка по возрастанию в столбце");
        int[] tmpArray = new int[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                tmpArray[i] = matrix[i][j];
            }
            Arrays.sort(tmpArray);
            for (int k = 0; k < n; k++) {
                matrix[k][j] = tmpArray[j];
            }
        }
        //////////////////////
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

}


