package b_algoritmization.b_multidimensionArrays;

public class Task3 {
    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void main(String[] args) {
        int[][] matrix = {
                {74, 76, 78, 70, 78},
                {4, 6, 5, 14, 1},
                {8, 7, 47, 14, 8}};

        int k = 3, p = 4;   // для вывода
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }
        System.out.println();
        for (int[] elem : matrix) {
            System.out.println(elem[p - 1]);
        }
    }
}