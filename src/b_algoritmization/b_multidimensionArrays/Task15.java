package b_algoritmization.b_multidimensionArrays;

public class Task15 {
    //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 8, 6, 7},
                {7, 1, 3, 3},
                {9, 8, 7, 2},
                {6, 4, 5, 8}};
        int max = matrix[0][0];
        for (int[] arr : matrix) {
            for (int elem : arr) {
                if (elem > max) {
                    max = elem;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i % 2 != 0) && (j % 2 != 0)) {
                    matrix[i][j] = max;
                }
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