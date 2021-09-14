package arr.multidim_1taskRest.p3;
/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {74, 76, 78, 70, 78},
                {4, 6, 5, 14, 1},
                {8, 7, 47, 14, 8}};
// для вывода
        int k = 3, p = 4;

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][p - 1]);
        }
    }
}