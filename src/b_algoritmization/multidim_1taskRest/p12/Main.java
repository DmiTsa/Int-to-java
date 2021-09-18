package b_algoritmization.multidim_1taskRest.p12;

import java.util.Arrays;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Main {
    public static void main(String[] args) {
        int matrix[][] = {{4, 8, 6, 7},
                {7, 1, 3, 3},
                {9, 8, 7, 2},
                {6, 4, 5, 8}};
        System.out.println("Сортировка по возрастанию строк");
        for (int i = 0; i < 4; i++) {
            Arrays.sort(matrix[i]);
        }
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
        System.out.println("Сортировка по убыванию строк");
        for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++) {
                matrix[i][j] *= -1;
            }
            Arrays.sort(matrix[i]);
        }
        for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++) {
                matrix[i][j] *= -1;
            }
        }
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
